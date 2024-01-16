package com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;

import com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request.ThirdBaseRequestDTO;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import lombok.*;



@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ProfileDTO extends ThirdBaseRequestDTO {

    private Status status;

    private boolean isDeleted;

    private LocalDateTime lastLoginDate;

    private String pin;


    private boolean isDefaultPassword;

    private String profileId;

    private String organizationId;

}
