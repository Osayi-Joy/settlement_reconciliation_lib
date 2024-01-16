package com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.repository;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.model.LoginAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginAttemptRepository extends JpaRepository<LoginAttempt, Long> {
  Optional<LoginAttempt> findFirstByUsernameOrderByCreatedDate(String username);
}
