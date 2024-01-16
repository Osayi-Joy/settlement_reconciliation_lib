package com.osayijoy.settlement_reconciliation_lib.modules.common.registration.dto;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request.ThirdBaseRequestDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserRegistrationDTO extends ThirdBaseRequestDTO {
  private String password;
  private String pin;
}
