package com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.model;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.enums.ProfileType;
import com.osayijoy.settlement_reconciliation_lib.registhentication.authentication.models.LoginAttemptBaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.*;

@Entity
@Table(name = "login_attempt")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LoginAttempt extends LoginAttemptBaseModel implements Serializable {

  @Enumerated(EnumType.STRING)
  private ProfileType profileType;
}
