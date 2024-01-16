package com.osayijoy.settlement_reconciliation_lib.processor.model;

import com.osayijoy.settlement_reconciliation_lib.processor.enums.ApprovalRequestStatus;
import lombok.*;

/**
 * @author Oluwatobi Ogunwuyi
 * @createdOn Oct-31(Mon)-2022
 */

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalResponse {

    private String description;
    private ApprovalRequestStatus requestStatus;
}
