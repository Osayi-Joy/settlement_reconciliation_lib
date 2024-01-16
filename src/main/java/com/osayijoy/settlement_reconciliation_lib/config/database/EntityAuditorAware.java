package com.osayijoy.settlement_reconciliation_lib.config.database;

import java.util.Optional;

import com.osayijoy.settlement_reconciliation_lib.commonUtils.util.ClientUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Configuration
@RequiredArgsConstructor
public class EntityAuditorAware implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {
    String author = "SYSTEM";
    String loggedInUsername = ClientUtil.getLoggedInUsername();
    if (!StringUtils.isEmpty(loggedInUsername)) author = loggedInUsername;

    return Optional.of(author);
  }
}
