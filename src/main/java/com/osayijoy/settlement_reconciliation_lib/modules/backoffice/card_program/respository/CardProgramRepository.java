package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_program.respository;

import java.time.LocalDateTime;
import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_program.model.CardProgram;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author Joy Osayi
 * @createdOn Jan-06(Sat)-2024
 */
@Repository
public interface CardProgramRepository extends JpaRepository<CardProgram, Long>, JpaSpecificationExecutor<CardProgram> {
    boolean existsByCardProgramNameOrCardProgramId(String cardProgramName, String cardProgramId);
    Page<CardProgram> findAllByIsDeletedFalse(Pageable pageable);
    Page<CardProgram> findAllByCardProgramStatusAndCreatedDateBetween(Status cardProgramStatus, LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);
    Optional<CardProgram> findFirstByCardProgramIdOrderByCreatedDate(String cardProgramId);
    Optional<CardProgram> findFirstByCardProgramStatusAndCardProgramIdOrderByCreatedDate(Status cardProgramStatus, String cardProgramId);
    boolean existsByCardProgramStatusAndCardProgramId(Status cardProgramStatus, String cardProgramId);

}
