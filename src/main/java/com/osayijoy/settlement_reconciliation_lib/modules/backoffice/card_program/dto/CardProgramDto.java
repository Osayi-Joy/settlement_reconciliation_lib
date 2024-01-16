package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_program.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import lombok.*;

/**
 * @author Joy Osayi
 * @createdOn Jan-06(Sat)-2024
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CardProgramDto {

    private String cardProgramName;
    private String cardProgramId;
    private String issuerId;
    private String cardSchemeId;
    private LocalTime dailyReconciliationTriggerTime;
    private LocalDateTime monthlyReportingTriggerDateAndTime;
    private String cardSchemeSettlementDataSource;
    private String inHouseTransactionDataSource;
    private List<String> reconciliationInHouseNotificationEmails;
    private List<String> reconciliationPartnerNotificationEmails;
    private String reconciliationInHouseStorageLocation;
    private String reconciliationPartnerStorageLocation;
    private List<String> revenueReportingInHouseNotificationEmails;
    private List<String> revenueReportingPartnerNotificationEmails;
    private String revenueReportingInHouseStorageLocation;
    private String revenueReportingPartnerStorageLocation;
    private Status cardProgramStatus;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}

