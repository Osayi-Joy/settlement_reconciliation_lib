package com.osayijoy.settlement_reconciliation_lib.processor.approval_repository;

import com.osayijoy.settlement_reconciliation_lib.processor.model.PendingFileRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Oluwatobi Ogunwuyi
 * @createdOn Nov-03(Thu)-2022
 */

@Repository
public interface PendingFileRequestRepository extends JpaRepository<PendingFileRequest, Long> {
}
