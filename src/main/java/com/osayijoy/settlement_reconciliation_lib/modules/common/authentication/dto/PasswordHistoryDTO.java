package com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Getter
@Setter
@ToString
public class PasswordHistoryDTO {
    private String oldPassword;
}
