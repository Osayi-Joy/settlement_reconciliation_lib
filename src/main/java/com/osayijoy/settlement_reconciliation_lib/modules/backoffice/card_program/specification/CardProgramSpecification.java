package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_program.specification;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_program.model.CardProgram;
import com.osayijoy.settlement_reconciliation_lib.modules.common.util.AutomataSearchRequest;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import static com.osayijoy.settlement_reconciliation_lib.modules.common.util.PageableUtil.toEndOfDay;
import static com.osayijoy.settlement_reconciliation_lib.modules.common.util.PageableUtil.toStartOfDay;

/**
 * @author Joy Osayi
 * @createdOn Jan-06(Sat)-2024
 */
@Component
@RequiredArgsConstructor
public class CardProgramSpecification implements Specification<CardProgram> {
    private final AutomataSearchRequest automataSearchRequest;

    @Override
    public Predicate toPredicate(Root<CardProgram> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        String searchValue = automataSearchRequest.getValue();

        if (searchValue != null) {
            String likePattern = "%" + searchValue.toLowerCase() + "%";
            predicates.add(
                    criteriaBuilder.or(
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("cardProgramName")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("cardProgramId")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("cardSchemeSettlementDataSource")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("inHouseTransactionDataSource")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("reconciliationInHouseStorageLocation")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("reconciliationPartnerStorageLocation")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("revenueReportingInHouseStorageLocation")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("issuerId").get("cardIssuerName")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("issuerId").get("cardIssuerId")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("cardSchemeId").get("cardSchemeName")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("cardSchemeId").get("cardSchemeId")), likePattern)


                    )
            );
        }

        if (automataSearchRequest.getStatus() != null) {
            predicates.add(criteriaBuilder.equal(root.get("cardProgramStatus"), automataSearchRequest.getStatus()));
        }

        if (automataSearchRequest.getStartDate() != null && automataSearchRequest.getEndDate() != null) {
            LocalDateTime start = toStartOfDay(automataSearchRequest.getStartDate());
            LocalDateTime end = toEndOfDay(automataSearchRequest.getEndDate());
            predicates.add(criteriaBuilder.between(root.get("createdDate"), start, end));
        }

        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }

    public CardProgramSpecification buildSpecification(AutomataSearchRequest automataSearchRequest) {
        return new CardProgramSpecification(automataSearchRequest);
    }
}

