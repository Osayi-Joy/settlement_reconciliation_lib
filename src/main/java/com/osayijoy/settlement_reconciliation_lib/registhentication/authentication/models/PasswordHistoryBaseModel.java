package com.osayijoy.settlement_reconciliation_lib.registhentication.authentication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.models.Auditable;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@MappedSuperclass
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class PasswordHistoryBaseModel extends Auditable<String> implements Serializable {

    private String oldPassword;
}
