package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.issuer_management.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.issuer_management.model.Issuer;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author Joy Osayi
 * @createdOn Dec-19(Tue)-2023
 */
@Repository
public interface IssuerRepository extends JpaRepository<Issuer, Long>, JpaSpecificationExecutor<Issuer> {
    Page<Issuer> findAllByIsDeleted(boolean isDeleted, Pageable pageable);
    Page<Issuer> findAllByIssuerStatusAndCreatedDateBetween(Status issuerStatus, LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);
    boolean existsByCardIssuerIdOrCardIssuerName(String cardIssuerId, String cardIssuerName);
    boolean existsByCardIssuerId(String cardIssuerId);
    Optional<Issuer> findFirstByIsDeletedFalseAndCardIssuerIdOrderByCreatedDate(String cardIssuerId);
    Optional<Issuer> findFirstByIssuerStatusAndCardIssuerId(Status issuerStatus, String cardIssuerId);
    boolean existsByIssuerStatusAndCardIssuerId(Status issuerStatus, String cardIssuerId);
}
