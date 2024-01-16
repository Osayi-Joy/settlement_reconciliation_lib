package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authentication.repository;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authentication.model.BackOfficeUserAuthProfile;
import com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.projection.AuthProfileProjection;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BackOfficeUserAuthProfileRepository
    extends JpaRepository<BackOfficeUserAuthProfile, Long>{
  Optional<BackOfficeUserAuthProfile> findFirstByUsernameOrderByCreatedDate(String username);

  @Query(
      "SELECT NEW com.digicore.automata.data.lib.modules.common.authorization.projection.AuthProfileProjection(a.backOfficeUserProfile.firstName, a.backOfficeUserProfile.lastName,'N/A',a.status) FROM BackOfficeUserAuthProfile a WHERE a.assignedRole = :role")
  List<AuthProfileProjection> findAllByAssignedRole(String role);

  List<BackOfficeUserAuthProfile> findAllByIsDeletedFalseAndAssignedRoleOrderByCreatedDateDesc(String role);

  @Query(
          "SELECT NEW com.digicore.automata.data.lib.modules.common.authorization.projection.AuthProfileProjection('N/A','N/A', a.assignedRole,a.status) FROM BackOfficeUserAuthProfile a WHERE a.backOfficeUserProfile.id = :id")
  Optional<AuthProfileProjection> findFirstByBackOfficeUserProfileId(Long id);

  Page<BackOfficeUserAuthProfile> findAllByIsDeletedFalseAndAssignedRoleContainingIgnoreCaseOrUsernameContainingIgnoreCaseOrderByCreatedDate(String role, String username,Pageable pageable);
  Page<BackOfficeUserAuthProfile> findAllByStatusAndIsDeletedFalseAndCreatedDateBetweenOrderByCreatedDate(Status status, LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);


  boolean existsByUsername(String username);
  List<BackOfficeUserAuthProfile> findByLastLoginDateBeforeAndStatus(LocalDateTime lastLoginDate, Status status);
}
