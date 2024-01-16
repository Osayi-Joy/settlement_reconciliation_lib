package com.osayijoy.settlement_reconciliation_lib.modules.common.audit_trail.specification;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.osayijoy.settlement_reconciliation_lib.modules.common.util.AutomataSearchRequest;
import com.osayijoy.settlement_reconciliation_lib.processor.model.AuditLog;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BackOfficeAuditTrailSpecification implements Specification<AuditLog> {

  private final AutomataSearchRequest automataSearchRequest;

  @Override
  public Predicate toPredicate(
          Root<AuditLog> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
    return buildPredicate(root, criteriaBuilder);
  }

  public Predicate buildPredicate(Root<AuditLog> root, CriteriaBuilder criteriaBuilder) {
    String likePattern = "%" + automataSearchRequest.getValue().toLowerCase() + "%";

    return criteriaBuilder.and(
        criteriaBuilder.or(
            criteriaBuilder.like(criteriaBuilder.lower(root.get("activity")), likePattern),
            criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), likePattern)));
  }

  public BackOfficeAuditTrailSpecification buildSpecification(
      AutomataSearchRequest automataSearchRequest) {
    return new BackOfficeAuditTrailSpecification(automataSearchRequest);
  }
}
