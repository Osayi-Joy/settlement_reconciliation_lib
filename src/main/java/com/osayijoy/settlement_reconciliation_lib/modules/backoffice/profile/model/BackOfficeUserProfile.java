package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.profile.model;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.models.BaseProfileModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.*;

@Entity
@Table(name = "backoffice_user_profile")
@Getter
@Setter
public class BackOfficeUserProfile extends BaseProfileModel implements Serializable {}
