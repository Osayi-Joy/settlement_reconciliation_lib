package com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.dto;

import java.io.Serializable;

import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.modules.common.constants.SystemConstants.ROLE_DESCRIPTION_IS_REQUIRED;
import static com.osayijoy.settlement_reconciliation_lib.modules.common.constants.SystemConstants.ROLE_NAME_IS_REQUIRED;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Getter
@Setter
@ToString
public class RoleBaseDTO implements Serializable {
  @RequestBodyChecker(message = ROLE_NAME_IS_REQUIRED)
  private String name;

  @RequestBodyChecker(message = ROLE_DESCRIPTION_IS_REQUIRED)
  private String description;

  private boolean active = true;


}
