package com.osayijoy.settlement_reconciliation_lib.modules.common.dto;

import lombok.*;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SystemIDGeneratorResult {
    private String incrementedCounter;
    private String generatedId;
}
