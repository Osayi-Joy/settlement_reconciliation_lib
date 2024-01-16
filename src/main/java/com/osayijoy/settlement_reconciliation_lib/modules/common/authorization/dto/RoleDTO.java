package com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Getter
@Setter
@ToString
public class RoleDTO extends RoleBaseDTO implements Serializable {
  private Set<PermissionDTO> permissions = new HashSet<>();
}
