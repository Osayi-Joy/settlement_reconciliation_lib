package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authentication.dto;


import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.commonUtils.util.RegexUtils.EMAIL_PATTERN;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.common.constants.RequestConstants.*;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Getter
@Setter
@ToString
public class InviteBodyDTO {
  @RequestBodyChecker(message = EMAIL_IS_REQUIRED_MESSAGE, pattern = EMAIL_PATTERN)
  private String email;

  @RequestBodyChecker(message = FIRST_NAME_IS_REQUIRED_MESSAGE)
  private String firstName;

  @RequestBodyChecker(message = ROLE_IS_REQUIRED_MESSAGE)
  private String assignedRole;
}
