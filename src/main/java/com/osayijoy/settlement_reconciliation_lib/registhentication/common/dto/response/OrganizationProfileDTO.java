package com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.request.FourthBaseRequestDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrganizationProfileDTO extends FourthBaseRequestDTO {
private String organizationId;
}
