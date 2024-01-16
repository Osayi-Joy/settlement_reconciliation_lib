package com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.dto;

import java.io.Serializable;

import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.modules.common.constants.SystemConstants.PERMISSION_NAME_IS_REQUIRED;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Getter
@Setter
@ToString
public class PermissionDTO implements Serializable {
  @RequestBodyChecker(message = PERMISSION_NAME_IS_REQUIRED)
  private String name;

  private String description;
  private String permissionType;
}
