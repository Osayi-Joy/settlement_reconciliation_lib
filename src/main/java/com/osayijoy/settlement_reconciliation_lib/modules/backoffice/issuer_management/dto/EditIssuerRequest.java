package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.issuer_management.dto;

import lombok.*;

/**
 * @author Joy Osayi
 * @createdOn Jan-02(Tue)-2024
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EditIssuerRequest {
    private String existingIssuerId;
    private String newIssuerId;
    private String newIssuerName;
}
