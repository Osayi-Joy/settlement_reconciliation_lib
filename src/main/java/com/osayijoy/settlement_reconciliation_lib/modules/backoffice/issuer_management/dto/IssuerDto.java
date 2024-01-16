package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.issuer_management.dto;

import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import lombok.*;

/**
 * @author Joy Osayi
 * @createdOn Dec-19(Tue)-2023
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class IssuerDto {

    private String cardIssuerName;
    private String cardIssuerId;
    private Status issuerStatus;
    private String createdDate;
    private String lastModified;
}
