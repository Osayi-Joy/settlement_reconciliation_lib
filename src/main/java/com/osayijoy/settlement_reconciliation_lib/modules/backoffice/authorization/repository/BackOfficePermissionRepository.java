package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authorization.repository;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */


import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authorization.model.BackOfficePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface BackOfficePermissionRepository extends JpaRepository<BackOfficePermission, Long>, JpaSpecificationExecutor<BackOfficePermission> {

  Optional<BackOfficePermission> findFirstByNameOrderByCreatedDate(String name);
}
