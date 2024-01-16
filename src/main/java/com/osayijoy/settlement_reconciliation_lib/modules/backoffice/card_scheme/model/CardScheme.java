package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_scheme.model;

import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.models.BaseModel;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author peaceobute
 * @since 2023/12/20
 */
@Entity
@Table(name = "card_scheme", indexes = @Index(columnList = "card_scheme_id"))
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CardScheme extends BaseModel implements Serializable {

    @Column(name = "card_scheme_name", nullable = false, unique = true)
    private String cardSchemeName;

    @Column(name = "card_scheme_id", nullable = false, unique = true)
    private String cardSchemeId;

    @Column(name = "card_status")
    @Enumerated(EnumType.STRING)
    private Status cardStatus;


}
