package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_scheme.dto;

import java.time.LocalDateTime;

import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author peaceobute
 * @since 2023/12/21
 */
@Getter
@Setter
@RequiredArgsConstructor
public class CardDto {

    private String cardSchemeName;

    private String cardSchemeId;

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;

    private Status cardStatus;
}
