package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authorization.specification;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authorization.model.BackOfficeRole;
import com.osayijoy.settlement_reconciliation_lib.modules.common.util.AutomataSearchRequest;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BackOfficeRoleSpecification implements Specification<BackOfficeRole> {

 private final AutomataSearchRequest automataSearchRequest;

 @Override
 public Predicate toPredicate(
         Root<BackOfficeRole> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
  Predicate notDeletedRoles = criteriaBuilder.isFalse(root.get("isDeleted"));
  String likePattern = "%" + automataSearchRequest.getValue().toLowerCase() + "%";

  return criteriaBuilder.and(
          notDeletedRoles,
          criteriaBuilder.or(
                  criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), likePattern),
                  criteriaBuilder.like(criteriaBuilder.lower(root.get("description")), likePattern),
                  criteriaBuilder.like(
                          criteriaBuilder.lower(
                                  root.joinSet("permissions").get("name")), likePattern),
                  criteriaBuilder.like(
                          criteriaBuilder.lower(
                                  root.joinSet("permissions").get("description")), likePattern),
                  criteriaBuilder.like(
                          criteriaBuilder.lower(
                                  root.joinSet("permissions").get("permissionType")),
                          likePattern)
          )
  );
 }

 public BackOfficeRoleSpecification buildSpecification(AutomataSearchRequest automataSearchRequest) {
  return new BackOfficeRoleSpecification(automataSearchRequest);
 }
}
