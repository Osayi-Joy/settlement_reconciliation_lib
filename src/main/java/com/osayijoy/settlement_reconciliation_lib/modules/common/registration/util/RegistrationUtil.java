package com.osayijoy.settlement_reconciliation_lib.modules.common.registration.util;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.osayijoy.settlement_reconciliation_lib.commonUtils.util.BeanUtilWrapper;
import com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.dto.UserProfileDTO;
import com.osayijoy.settlement_reconciliation_lib.modules.common.registration.dto.UserRegistrationDTO;
import org.springframework.stereotype.Component;

@Component
public class RegistrationUtil {


 public static UserProfileDTO getUserProfileDTO(UserRegistrationDTO registrationRequest) {
  UserProfileDTO profileDto = new UserProfileDTO();
  BeanUtilWrapper.copyNonNullProperties(registrationRequest, profileDto);
  profileDto.setPassword(registrationRequest.getPassword());
  profileDto.setPin(null);
  return profileDto;
 }
}
