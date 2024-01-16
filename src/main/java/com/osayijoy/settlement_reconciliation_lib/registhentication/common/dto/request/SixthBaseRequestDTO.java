package com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request;


import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.EMAIL_IS_REQUIRED_MESSAGE;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.EMAIL_PATTERN;

/*
 * @author Oluwatobi Ogunwuyi
 * @createdOn Jul-20(Thu)-2023
 */

@Setter
@Getter
@ToString
public class SixthBaseRequestDTO {
 @RequestBodyChecker(message = EMAIL_IS_REQUIRED_MESSAGE,pattern = EMAIL_PATTERN)
 private String email;

}
