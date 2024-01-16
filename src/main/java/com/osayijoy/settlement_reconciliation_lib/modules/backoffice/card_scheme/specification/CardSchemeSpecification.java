package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_scheme.specification;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.card_scheme.model.CardScheme;
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
 * @author peaceobute
 * @since 2023/12/21
 */
@Component
@RequiredArgsConstructor
public class CardSchemeSpecification implements Specification<CardScheme> {

    private final AutomataSearchRequest automataSearchRequest;


    @Override
    public Predicate toPredicate(Root<CardScheme> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        String searchValue = automataSearchRequest.getValue();
        Predicate notDeletedIssuers = criteriaBuilder.isFalse(root.get("isDeleted"));

        if (searchValue != null) {
            String likePattern = "%" + searchValue.toLowerCase() + "%";
            predicates.add(
                    criteriaBuilder.or(
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("cardSchemeName")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("cardSchemeId")), likePattern)
                    )
            );
        }
        if (automataSearchRequest.getStatus() != null) {
            predicates.add(criteriaBuilder.equal(root.get("cardStatus"), automataSearchRequest.getStatus()));
        }
        if (automataSearchRequest.getStartDate() != null && automataSearchRequest.getEndDate() != null) {
            LocalDateTime start = toStartOfDay(automataSearchRequest.getStartDate());
            LocalDateTime end = toEndOfDay(automataSearchRequest.getEndDate());
            predicates.add(criteriaBuilder.between(root.get("createdDate"), start, end));
        }
        predicates.add(notDeletedIssuers);
        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }


        public CardSchemeSpecification buildSpecification(AutomataSearchRequest automataSearchRequest){
        return new CardSchemeSpecification(automataSearchRequest);
    }
}
