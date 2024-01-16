package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.issuer_management.model;

import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.models.BaseModel;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

/**
 * @author Joy Osayi
 * @createdOn Dec-19(Tue)-2023
 */
@Entity
@Table(name = "card_issuers", indexes = {
        @Index(columnList = "card_issuer_id"),
        @Index(columnList = "card_issuer_name")
})
@Getter
@Setter
@ToString
public class Issuer extends BaseModel implements Serializable {
    @Column(name = "card_issuer_name", unique = true, nullable = false)
    private String cardIssuerName;

    @Column(name = "card_issuer_id", unique = true, nullable = false)
    private String cardIssuerId;

    @Column(name = "issuer_status")
    @Enumerated(EnumType.STRING)
    private Status issuerStatus;
}

