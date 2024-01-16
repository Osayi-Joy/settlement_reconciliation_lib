package com.osayijoy.settlement_reconciliation_lib.registhentication.authentication.dtos.request;

import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.OLD_PASSWORD_IS_REQUIRED_MESSAGE;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.UPDATE_PASSWORD_IS_REQUIRED_MESSAGE;

/**
 * @author Joy Osayi
 * @createdOn Sep-08(Fri)-2023
 */
@Setter
@Getter
@ToString
public class UpdatePasswordRequestDTO {
    @RequestBodyChecker(message = OLD_PASSWORD_IS_REQUIRED_MESSAGE)
    private String oldPassword;
    @RequestBodyChecker(message = UPDATE_PASSWORD_IS_REQUIRED_MESSAGE)
    private String newPassword;
}
