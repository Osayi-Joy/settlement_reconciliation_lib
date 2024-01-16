package com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.dto;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;

import com.osayijoy.settlement_reconciliation_lib.modules.common.authorization.dto.PermissionDTO;
import com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.response.ProfileDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserProfileDTO extends ProfileDTO implements UserDetails, Serializable {
  private String password;

  private Set<SimpleGrantedAuthority> permissions;
  private Set<PermissionDTO> userPermissions;
  private LocalDateTime lastPasswordUpdatedDate;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return this.permissions;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
