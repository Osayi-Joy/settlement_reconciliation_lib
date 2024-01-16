package com.osayijoy.settlement_reconciliation_lib.modules.common.util;

import com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request.SearchRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Getter
@Setter
@NoArgsConstructor
@Component
public class AutomataSearchRequest extends SearchRequest {

    private String key;
    private String value;
    private boolean isForFilter;
}
