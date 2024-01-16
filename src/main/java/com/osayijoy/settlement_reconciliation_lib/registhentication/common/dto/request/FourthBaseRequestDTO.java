package com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request;

import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.*;

@Setter
@Getter
@ToString
public class FourthBaseRequestDTO{
 @RequestBodyChecker(message = ORGANIZATION_NAME_IS_REQUIRED_MESSAGE)
 private String organizationName;
 @RequestBodyChecker(message = ORGANIZATION_EMAIL_IS_REQUIRED_MESSAGE)
 private String organizationEmail;
 @RequestBodyChecker(message = CEO_EMAIL_IS_REQUIRED_MESSAGE)
 private String ceoEmail;

}
