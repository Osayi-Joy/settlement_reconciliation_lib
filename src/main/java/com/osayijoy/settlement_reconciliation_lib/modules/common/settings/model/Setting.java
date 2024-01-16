package com.osayijoy.settlement_reconciliation_lib.modules.common.settings.model;

import com.osayijoy.settlement_reconciliation_lib.registhentication.registration.models.BaseModel;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Entity
@Table(name = "settings", indexes = @Index(columnList = "setting_key"))
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Setting extends BaseModel implements Serializable {

    @Column(name = "setting_key", unique = true, nullable = false)
    private String key;

    @Column(name = "setting_type", nullable = false)
    private String settingType;

    @Column(name = "setting_value", nullable = false, columnDefinition = "text")
    private String value;

    @Column(name = "setting_description", nullable = false, columnDefinition = "text")
    private String description;

    private boolean settingVisible = true;

}
