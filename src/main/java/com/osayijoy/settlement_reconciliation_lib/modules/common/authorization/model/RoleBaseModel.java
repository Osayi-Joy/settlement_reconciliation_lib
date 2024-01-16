package com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.model;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.models.BaseModel;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
@NoArgsConstructor
@MappedSuperclass
public class RoleBaseModel extends BaseModel implements Serializable {
  @Column(nullable = false)
  private String name;

  private String description;

  @Column(nullable = false)
  private boolean active = true;
}
