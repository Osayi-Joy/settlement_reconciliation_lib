package com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request;


import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.ROLE_IS_REQUIRED_MESSAGE;


@Setter
@Getter
@ToString
public class ThirdBaseRequestDTO extends SecondBaseRequestDTO {
 @RequestBodyChecker(message = ROLE_IS_REQUIRED_MESSAGE)
 private String assignedRole;
}
