package com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.dto;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoleDTOWithTeamMembers extends RoleDTO implements Serializable {
   private int totalTeamMemberCount;
   private List<String> teamMembers;
}
