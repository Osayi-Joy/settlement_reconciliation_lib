package com.osayijoy.settlement_reconciliation_lib.modules.common.settings.repository;

import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.modules.common.settings.model.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {
    Optional<Setting> findFirstByKeyOrderByCreatedDateDesc(String key);

    boolean existsByKey(String settingKey);

}
