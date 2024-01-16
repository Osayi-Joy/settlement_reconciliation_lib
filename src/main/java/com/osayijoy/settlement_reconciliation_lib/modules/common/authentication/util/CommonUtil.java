package com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.util;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.osayijoy.settlement_reconciliation_lib.modules.common.authentication.dto.UserProfileDTO;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

public class CommonUtil {

  private CommonUtil() {}

  public static Map<String, String> getClaims(String username, UserProfileDTO userDetails) {
    return buildClaims(username, userDetails, null);
  }

  public static Map<String, String> getClaims(
      String username, UserProfileDTO userDetails, String resetKey) {
    return buildClaims(username, userDetails, resetKey);
  }

  private static Map<String, String> buildClaims(
      String username, UserProfileDTO userDetails, String resetKey) {
    Map<String, String> claims = new HashMap<>();
    claims.put("username", username);

    String authorities =
        userDetails.getAuthorities().stream()
            .map(GrantedAuthority::getAuthority)
            .collect(Collectors.joining(" "));
    claims.put("permissions", authorities);
    claims.put("email", userDetails.getEmail());
    claims.put("name", userDetails.getFirstName().concat(" ").concat(userDetails.getLastName()));
    claims.put("role", userDetails.getAssignedRole());
    claims.put("proceed", String.valueOf(userDetails.isDefaultPassword()));
    if (null != resetKey && !"".equalsIgnoreCase(resetKey)) claims.put("resetKey", resetKey);
    return claims;
  }
}
