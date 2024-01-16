package com.osayijoy.settlement_reconciliation_lib.modules.common.settings.dto;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;

import com.osayijoy.settlement_reconciliation_lib.commonUtils.validator.RequestBodyChecker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.osayijoy.settlement_reconciliation_lib.modules.common.constants.SystemConstants.*;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class SettingDTO {
 @RequestBodyChecker(message = SETTING_KEY_IS_REQUIRED)
 private String key;

 @RequestBodyChecker(message = SETTING_TYPE_IS_REQUIRED)
 private String settingType;

 @RequestBodyChecker(message = SETTING_VALUE_IS_REQUIRED)
 private String value;
 @RequestBodyChecker(message = SETTING_DESCRIPTION_IS_REQUIRED)
 private String description;

 private String lastModifiedBy;

 private LocalDateTime lastModifiedDate;
 private boolean settingVisible;
}
