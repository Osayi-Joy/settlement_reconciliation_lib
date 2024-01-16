package com.osayijoy.settlement_reconciliation_lib.config.controller_advice;

import java.util.Collections;

import com.osayijoy.settlement_reconciliation_lib.config.helper.response.ApiError;
import com.osayijoy.settlement_reconciliation_lib.config.helper.response.ControllerResponse;
import org.springframework.http.*;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.server.resource.InvalidBearerTokenException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@ControllerAdvice
public class AutomataControllerAdvice {

  @ExceptionHandler({
    AuthenticationException.class,
    InvalidBearerTokenException.class,
    AccessDeniedException.class
  })
  public ResponseEntity<Object> handleAuthenticationException(Exception ex) {

    String message = "You are not authorized to make this request";

    if (ex instanceof InvalidBearerTokenException || ex instanceof BadCredentialsException) {
      message = "The access token supplied is invalid or expired";
    }

    ApiError error = new ApiError(message, "99");
    return ControllerResponse.buildFailureResponse(
        Collections.singletonList(error), HttpStatus.FORBIDDEN);
  }
}
