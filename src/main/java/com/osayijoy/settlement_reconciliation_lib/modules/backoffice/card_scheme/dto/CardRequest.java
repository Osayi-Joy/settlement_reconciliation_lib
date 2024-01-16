package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_scheme.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Peace Obute
 * @since 2023/12/21
 */
@Getter
@Setter
@RequiredArgsConstructor
public class CardRequest {

    private String cardSchemeName;

    private String cardSchemeId;


}
