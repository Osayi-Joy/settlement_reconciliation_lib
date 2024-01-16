package com.osayijoy.settlement_reconciliation_lib.registhentication.authentication.dtos.request;
/*
 * @author Oluwatobi Ogunwuyi
 * @createdOn Jun-17(Sat)-2023
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.*;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.UPDATE_PASSWORD_IS_REQUIRED_MESSAGE;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ResetPasswordSecondBaseRequestDTO extends ResetPasswordFirstBaseRequestDTO {
 @RequestBodyChecker(message = UPDATE_PASSWORD_IS_REQUIRED_MESSAGE)
 private String newPassword;
}
