package com.osayijoy.settlement_reconciliation_lib.modules.backoffice.authorization.model;


import com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.model.RoleBaseModel;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Entity
@Table(name = "roles")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BackOfficeRole extends RoleBaseModel implements Serializable {
    @Column(nullable = false)
    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "system_roles_and_permissions_mapping",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id")})
    @ToString.Exclude
    private Set<BackOfficePermission> permissions = new HashSet<>();
}
