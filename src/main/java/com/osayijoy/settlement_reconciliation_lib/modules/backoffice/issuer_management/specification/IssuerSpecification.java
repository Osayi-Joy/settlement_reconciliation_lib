package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.issuer_management.specification;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.issuer_management.model.Issuer;
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
 * @createdOn Dec-19(Tue)-2023
 */
@Component
@RequiredArgsConstructor
public class IssuerSpecification implements Specification<Issuer> {
    private final AutomataSearchRequest automataSearchRequest;

    @Override
    public Predicate toPredicate(Root<Issuer> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        String searchValue = automataSearchRequest.getValue();
        Predicate notDeletedIssuers = criteriaBuilder.isFalse(root.get("isDeleted"));

        if (searchValue != null) {
            String likePattern = "%" + searchValue.toLowerCase() + "%";
            predicates.add(
                    criteriaBuilder.or(
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("cardIssuerName")), likePattern),
                            criteriaBuilder.like(criteriaBuilder.lower(root.get("cardIssuerId")), likePattern)
                    )
            );
        }

        if (automataSearchRequest.getStatus() != null) {
            predicates.add(criteriaBuilder.equal(root.get("issuerStatus"), automataSearchRequest.getStatus()));
        }

        if (automataSearchRequest.getStartDate() != null && automataSearchRequest.getEndDate() != null) {
            LocalDateTime start = toStartOfDay(automataSearchRequest.getStartDate());
            LocalDateTime end = toEndOfDay(automataSearchRequest.getEndDate());
            predicates.add(criteriaBuilder.between(root.get("createdDate"), start, end));
        }
        predicates.add(notDeletedIssuers);
        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }

    public IssuerSpecification buildSpecification(AutomataSearchRequest automataSearchRequest) {
        return new IssuerSpecification(automataSearchRequest);
    }
}
