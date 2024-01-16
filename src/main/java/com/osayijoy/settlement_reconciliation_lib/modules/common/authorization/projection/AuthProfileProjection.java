package com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.projection;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AuthProfileProjection {
 private String firstName;
 private String lastName;
 private String assignedRole;
 private Status status;
}
