package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.profile.specification;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.profile.model.BackOfficeUserProfile;
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
public class BackOfficeUserProfileSpecification implements Specification<BackOfficeUserProfile> {

 private final AutomataSearchRequest automataSearchRequest;


 @Override
 public Predicate toPredicate(Root<BackOfficeUserProfile> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
  String likePattern = "%" + automataSearchRequest.getValue().toLowerCase() + "%";
  return criteriaBuilder.or(
          criteriaBuilder.like(criteriaBuilder.lower(root.get("profileId")), likePattern),
          criteriaBuilder.like(criteriaBuilder.lower(root.get("firstName")), likePattern),
          criteriaBuilder.like(criteriaBuilder.lower(root.get("lastName")), likePattern),
          criteriaBuilder.like(criteriaBuilder.lower(root.get("phoneNumber")), likePattern),
          criteriaBuilder.like(criteriaBuilder.lower(root.get("email")), likePattern)
  );
 }

 public BackOfficeUserProfileSpecification buildSpecification(AutomataSearchRequest automataSearchRequest){
  return new BackOfficeUserProfileSpecification(automataSearchRequest);
 }
}
