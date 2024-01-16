package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authentication.model;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authorization.model.BackOfficePermission;
import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.profile.model.BackOfficeUserProfile;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.models.UserProfile;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import lombok.*;

@Entity
@Table(name = "backoffice_user_auth_profile", indexes = @Index(columnList = "username"))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BackOfficeUserAuthProfile extends UserProfile implements Serializable {

  @OneToOne
  @JoinColumn(name = "backoffice_user_profile_id")
  private BackOfficeUserProfile backOfficeUserProfile;

  private String assignedRole;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
      name = "backoffice_user_auth_profiles_and_permissions_mapping",
      joinColumns =
          @JoinColumn(name = "backoffice_user_auth_profile_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "id"))
  @ToString.Exclude
  private Set<BackOfficePermission> permissions = new HashSet<>();

  @OneToMany(mappedBy = "backOfficeUserAuthProfile", cascade = CascadeType.ALL)
  private Set<BackOfficePasswordHistory> backOfficePasswordHistories = new HashSet<>();

}
