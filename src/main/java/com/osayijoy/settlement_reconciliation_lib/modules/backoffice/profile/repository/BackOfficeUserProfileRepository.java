package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.profile.repository;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.modules.backoffice.profile.model.BackOfficeUserProfile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BackOfficeUserProfileRepository
    extends JpaRepository<BackOfficeUserProfile, Long>, JpaSpecificationExecutor<BackOfficeUserProfile> {

  Optional<BackOfficeUserProfile> findFirstByEmailOrderByCreatedDate(String email);

  Page<BackOfficeUserProfile> findAllByIsDeleted(boolean deleted, Pageable pageable);

  boolean existsByEmail(String email);
}
