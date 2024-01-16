package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authorization.model;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.model.PermissionBaseModel;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "permissions")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BackOfficePermission extends PermissionBaseModel implements Serializable {
}
