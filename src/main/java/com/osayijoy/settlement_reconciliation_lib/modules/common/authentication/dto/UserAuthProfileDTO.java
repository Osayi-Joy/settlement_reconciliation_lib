package com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authentication.model.BackOfficePasswordHistory;
import com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.dto.PermissionDTO;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.models.UserProfile;
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
public class UserAuthProfileDTO extends UserProfile implements Serializable {
  private UserProfileDTO userProfile;
  private String assignedRole;
  private Set<PermissionDTO> permissions = new HashSet<>();
  private Set<BackOfficePasswordHistory> passwordHistories = new HashSet<>();
}
