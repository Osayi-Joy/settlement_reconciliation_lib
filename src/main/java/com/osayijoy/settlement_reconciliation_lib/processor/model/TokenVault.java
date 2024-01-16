package com.osayijoy.settlement_reconciliation_lib.processor.model;

import jakarta.persistence.*;
import java.util.Objects;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

/**
 * @author Oluwatobi Ogunwuyi
 * @createdOn Nov-01(Tue)-2022
 */

@Entity
@Table(name = "token_mapping")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class TokenVault {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_name",unique = true)
    private String userName;

    @Column(name = "token",unique = true)
    private String token;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TokenVault that = (TokenVault) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
