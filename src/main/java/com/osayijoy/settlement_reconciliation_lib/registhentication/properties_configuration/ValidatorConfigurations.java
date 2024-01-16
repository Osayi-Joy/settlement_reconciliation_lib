package com.osayijoy.settlement_reconciliation_lib.registhentication.properties_configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

/*
 * @author Oluwatobi Ogunwuyi
 * @createdOn Jun-13(Tue)-2023
 */

@Getter
@Setter
@Component
@ConfigurationPropertiesScan
@ConfigurationProperties(prefix = "digicore.registhentication.validator")
public class ValidatorConfigurations {
    private String webPlatformSecret = "web_secret";
    private String mobilePlatformSecret = "mobile_secret";
    private boolean shouldValidateRequestLocation = false;
    private boolean shouldValidatePassword = true;

}
