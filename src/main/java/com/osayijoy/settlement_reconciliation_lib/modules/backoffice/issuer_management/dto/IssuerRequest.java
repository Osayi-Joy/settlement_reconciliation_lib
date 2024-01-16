package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.issuer_management.dto;

import lombok.*;

/**
 * @author Joy Osayi
 * @createdOn Dec-20(Wed)-2023
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class IssuerRequest {
    private String cardIssuerName;
    private String cardIssuerId;
}
