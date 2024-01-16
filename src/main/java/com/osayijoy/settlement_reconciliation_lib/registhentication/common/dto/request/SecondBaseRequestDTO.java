package com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request;

import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.*;

/*
 * @author Oluwatobi Ogunwuyi
 * @createdOn Jun-29(Thu)-2023
 */
@Setter
@Getter
@ToString
public class SecondBaseRequestDTO extends FirstBaseRequestDTO{

 @RequestBodyChecker(message = FIRST_NAME_IS_REQUIRED_MESSAGE)
 private String firstName;

 @RequestBodyChecker(message = LAST_NAME_IS_REQUIRED_MESSAGE)
 private String lastName;

 @RequestBodyChecker(message = PHONE_NUMBER_IS_REQUIRED_MESSAGE,pattern = PHONE_NUMBER_PATTERN)
 private String phoneNumber;

 private String referralCode;
//
// @RequestBodyChecker(message = PASSWORD_IS_REQUIRED_MESSAGE, passwordCheck = true)
// private String password;



}
