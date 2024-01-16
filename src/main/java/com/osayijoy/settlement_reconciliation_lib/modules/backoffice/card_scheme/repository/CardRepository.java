package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_scheme.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_scheme.model.CardScheme;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author peaceobute
 * @since 2023/12/21
 */
@Repository
public interface CardRepository extends JpaRepository<CardScheme, Long> , JpaSpecificationExecutor<CardScheme> {

    Page<CardScheme> findAllByIsDeleted(boolean isDeleted, Pageable pageable);
    Page<CardScheme> findAllByCardStatusAndCreatedDateBetween(Status cardStatus, LocalDateTime startDate,
                                                              LocalDateTime endDate, Pageable pageable);
    boolean existsByCardSchemeId(String cardSchemeId);
    Optional<CardScheme> findFirstByIsDeletedFalseAndCardSchemeIdOrderByCreatedDate(String cardSchemId);
    Optional<CardScheme> findFirstByCardStatusAndCardSchemeIdOrderByCreatedDate(Status cardStatus, String cardSchemId);
    boolean existsByCardStatusAndCardSchemeId(Status cardStatus, String cardSchemeId);

}
