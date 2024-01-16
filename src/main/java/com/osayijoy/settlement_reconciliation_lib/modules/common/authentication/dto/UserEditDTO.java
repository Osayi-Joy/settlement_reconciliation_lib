package com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request.ThirdBaseRequestDTO;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.enums.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserEditDTO extends ThirdBaseRequestDTO {
    private Status status;
}
