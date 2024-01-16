package com.osayijoy.settlement_reconciliation_lib.config.database;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.osayijoy.settlement_reconciliation_lib.config.properties.PropertyConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Profile({"dev", "pilot", "prod", "test"})
@Configuration
@ComponentScan({"com.digicore.automata.data.lib.modules", "com.digicore.otp"})
@EntityScan({"com.digicore.automata.data.lib.modules", "com.digicore.otp"})
@EnableJpaRepositories(basePackages = {"com.digicore.automata.data.lib.modules", "com.digicore.otp"})
@RequiredArgsConstructor
@EnableJpaAuditing
public class DataSourceConfig {
  private final PropertyConfig propertyConfig;

  @Bean
  @Primary
  @Profile({"dev", "pilot", "prod", "test"})
  public DataSource dataSource() {
    return this.getHikariDataSource();
  }

  private HikariDataSource getHikariDataSource() {
    HikariDataSource dataSource = new HikariDataSource();
    dataSource.setDriverClassName(propertyConfig.getDatabaseDriver());
    dataSource.setJdbcUrl(propertyConfig.getDatabaseUrl());
    dataSource.setUsername(propertyConfig.getDatabaseUsername());
    dataSource.setPassword(propertyConfig.getDatabasePassword());
    dataSource.setConnectionTimeout(30000L);
    return dataSource;
  }
}
