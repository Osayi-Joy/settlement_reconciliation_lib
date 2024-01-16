package com.osayijoy.settlement_reconciliation_lib.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Component
@ConfigurationPropertiesScan
@ConfigurationProperties(prefix = "automata")
@Getter
@Setter
public class PropertyConfig {


  // database
  public String databaseUrl = "jdbc:mysql://localhost:3306/automata?allowPublicKeyRetrieval=true&useSSL=false";
  public String databaseUsername = "root";
  public String databasePassword = "";
  public String databaseDriver = "com.mysql.cj.jdbc.Driver";
  public String databaseMaxActive = "1000";
  public String databaseHibernateDialect = "org.hibernate.dialect.MySQLDialect";
  // login
  private int inactivityDays = 10;
  public int loginAttemptMaxCount = 10;
  public long loginAttemptAutoUnlockDuration = 30;
  // security
  public String securityJWTKeyStorePath = "";
  public String securityJWTKeyStorePassword = "";
  public String securityJWTKeyAlias = "";
  public String securityJWTPrivateKeyPassphrase = "";
  // system
  public String systemDefinedPermissions = null;
  public String systemIntegratedAggregators = null;
  // swagger
  public String swaggerUrl = "https://uat.digicoreltd.com/automata-backoffice";
  public String issueTrackerUrl = "";
  public String projectTitle = "Automata Platform/BackOffice APIs";
  public String projectVersion = "0.0.1-SNAPSHOT";
  public String projectDescription = "This documentation contains all the APIs exposed for the backoffice console. Aside the authentication and reset password APIs, all other APIs requires a valid authenticated user jwt access token before they can be invoked";
  public String serverDescription = "Digicore Development Server";




  public boolean smsVerificationRequired = true;
}
