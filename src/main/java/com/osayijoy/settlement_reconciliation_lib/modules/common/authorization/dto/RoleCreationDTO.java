package com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.dto;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoleCreationDTO extends RoleBaseDTO implements Serializable {
 private Set<String> permissions = new HashSet<>();
}
