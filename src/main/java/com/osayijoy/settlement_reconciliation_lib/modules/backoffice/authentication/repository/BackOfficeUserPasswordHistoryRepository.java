package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authentication.repository;


import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authentication.model.BackOfficePasswordHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
public interface BackOfficeUserPasswordHistoryRepository extends JpaRepository<BackOfficePasswordHistory,Long> {
}
