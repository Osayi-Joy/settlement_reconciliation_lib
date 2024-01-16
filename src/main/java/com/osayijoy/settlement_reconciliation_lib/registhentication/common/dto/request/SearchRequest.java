package com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request;

import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequest {
    @RequestBodyChecker(
            message = "start date is required"
    )
    private String startDate;
    @RequestBodyChecker(
            message = "end date is required"
    )
    private String endDate;
    private Status status;
    @RequestBodyChecker(
            exportFormatCheck = true,
            message = "download format is required, allowed values [CSV or PDF]"
    )
    private String downloadFormat;

    private int page;
    private int size;

    public SearchRequest() {
    }
}
