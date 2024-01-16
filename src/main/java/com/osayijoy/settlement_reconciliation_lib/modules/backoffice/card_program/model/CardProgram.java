package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_program.model;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_scheme.model.CardScheme;
import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.issuer_management.model.Issuer;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.models.BaseModel;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Joy Osayi
 * @createdOn Jan-06(Sat)-2024
 */

@Entity
@Table(name = "card_programs", indexes = {
        @Index(columnList = "card_program_id"),
        @Index(columnList = "card_program_name")
})
@Getter
@Setter
@ToString
public class CardProgram extends BaseModel implements Serializable {

    @Column(name = "card_program_name")
    private String cardProgramName;

    @Column(name = "card_program_id")
    private String cardProgramId;

    @OneToOne
    @JoinColumn(name = "issuer_id")
    private Issuer issuerId;

    @OneToOne
    @JoinColumn(name = "card_scheme_id")
    private CardScheme cardSchemeId;

    @Column(name = "daily_reconciliation_trigger_time")
    private LocalTime dailyReconciliationTriggerTime;

    @Column(name = "monthly_reporting_trigger_date_and_time")
    private LocalDateTime monthlyReportingTriggerDateAndTime;

    @Column(name = "card_scheme_settlement_data_source")
    private String cardSchemeSettlementDataSource;

    @Column(name = "in_house_transaction_data_source")
    private String inHouseTransactionDataSource;

    @ElementCollection
    @CollectionTable(name = "reconciliation_in_house_notification_emails",
            joinColumns = @JoinColumn(name = "card_program_id"))
    @Column(name = "email_address")
    private List<String> reconciliationInHouseNotificationEmails;

    @ElementCollection
    @CollectionTable(name = "reconciliation_partner_notification_emails",
            joinColumns = @JoinColumn(name = "card_program_id"))
    @Column(name = "email_address")
    private List<String> reconciliationPartnerNotificationEmails;

    @Column(name = "reconciliation_in_house_storage_location")
    private String reconciliationInHouseStorageLocation;

    @Column(name = "reconciliation_partner_storage_location")
    private String reconciliationPartnerStorageLocation;

    @ElementCollection
    @CollectionTable(name = "revenue_reporting_in_house_notification_emails",
            joinColumns = @JoinColumn(name = "card_program_id"))
    @Column(name = "email_address")
    private List<String> revenueReportingInHouseNotificationEmails;

    @ElementCollection
    @CollectionTable(name = "revenue_reporting_partner_notification_emails",
            joinColumns = @JoinColumn(name = "card_program_id"))
    @Column(name = "email_address")
    private List<String> revenueReportingPartnerNotificationEmails;

    @Column(name = "revenue_reporting_in_house_storage_location")
    private String revenueReportingInHouseStorageLocation;

    @Column(name = "revenue_reporting_partner_storage_location")
    private String revenueReportingPartnerStorageLocation;

    @Column(name = "card_program_status")
    @Enumerated(EnumType.STRING)
    private Status cardProgramStatus;
}

