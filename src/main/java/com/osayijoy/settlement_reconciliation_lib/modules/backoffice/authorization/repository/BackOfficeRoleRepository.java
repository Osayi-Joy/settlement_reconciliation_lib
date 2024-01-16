package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authorization.repository;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authorization.model.BackOfficeRole;
import com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.projection.RoleProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BackOfficeRoleRepository extends JpaRepository<BackOfficeRole, Long>, JpaSpecificationExecutor<BackOfficeRole> {
  Optional<BackOfficeRole> findFirstByNameAndActiveOrderByCreatedDate(String name, boolean active);
  Optional<BackOfficeRole> findFirstByNameAndIsDeletedOrderByCreatedDate(String name, boolean active);

  Optional<BackOfficeRole> findFirstByNameOrderByCreatedDate(String name);

  @Query(
          "SELECT NEW com.digicore.automata.data.lib.modules.common.authorization.projection.RoleProjection(a.name) FROM BackOfficeRole a WHERE a.active = :status")
  List<RoleProjection> findAllByActive(boolean status);

  Page<BackOfficeRole> findAllByIsDeleted(boolean isDeleted, Pageable pageable);

  List<BackOfficeRole> findAllByIsDeleted(boolean isDeleted);
  Page<BackOfficeRole> findAllByActiveAndCreatedDateBetween(boolean active, LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);

  boolean existsByName(String name);
}
