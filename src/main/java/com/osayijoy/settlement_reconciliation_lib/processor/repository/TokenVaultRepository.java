package com.osayijoy.settlement_reconciliation_lib.processor.repository;

import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.processor.model.TokenVault;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Oluwatobi Ogunwuyi
 * @createdOn Nov-01(Tue)-2022
 */
public interface TokenVaultRepository extends JpaRepository<TokenVault,Long> {
    Optional<TokenVault> findByUserName(String username);
    Optional<TokenVault> findByToken(String token);
}
