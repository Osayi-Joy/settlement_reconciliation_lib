package com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request;

import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.*;

/*
 * @author Oluwatobi Ogunwuyi
 * @createdOn Jun-17(Sat)-2023
 */
@Setter
@Getter
@ToString
public class FirstBaseRequestDTO {
    @RequestBodyChecker(message = USERNAME_IS_REQUIRED_MESSAGE)
    private String username;
    @RequestBodyChecker(message = EMAIL_IS_REQUIRED_MESSAGE,pattern = EMAIL_PATTERN)
    private String email;
}
