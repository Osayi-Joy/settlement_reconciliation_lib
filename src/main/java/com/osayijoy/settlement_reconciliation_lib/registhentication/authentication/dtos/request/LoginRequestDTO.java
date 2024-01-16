package com.osayijoy.settlement_reconciliation_lib.registhentication.authentication.dtos.request;

/*
 * @author Oluwatobi Ogunwuyi
 * @createdOn Jun-17(Sat)-2023
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.osayijoy.settlement_reconciliation_lib.registhentication.authentication.enums.AuthenticationType;
import com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request.FirstBaseRequestDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class LoginRequestDTO extends FirstBaseRequestDTO {
  private String password;
  private String fingerPrintHash;
  private String otp;
  private String token;
  private String pin;
  private AuthenticationType authenticationType;
}
