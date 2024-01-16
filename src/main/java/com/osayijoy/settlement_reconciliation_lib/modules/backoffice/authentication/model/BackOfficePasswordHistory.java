package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authentication.model;

import com.osayijoy.settlement_reconciliation_lib.registhentication.authentication.models.PasswordHistoryBaseModel;
import jakarta.persistence.*;
import lombok.*;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Entity
@Table(name = "backoffice_user_password_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BackOfficePasswordHistory extends PasswordHistoryBaseModel {

    @ManyToOne
    @JoinColumn(
            name = "user_id"
    )
    private BackOfficeUserAuthProfile backOfficeUserAuthProfile;

}
