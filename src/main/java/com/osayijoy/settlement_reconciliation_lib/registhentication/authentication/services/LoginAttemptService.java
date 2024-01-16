package com.osayijoy.settlement_reconciliation_lib.registhentication.authentication.services;


import com.osayijoy.settlement_reconciliation_lib.config.helper.exception.ZeusRuntimeException;
import com.osayijoy.settlement_reconciliation_lib.config.helper.response.ApiError;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.authentication.exceptions.messages.LoginErrorMessages.IMPLEMENTATION_NOT_FOUND_VERIFY_ATTEMPT_CODE;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.exceptions.messages.ErrorMessages.IMPLEMENTATION_NOT_FOUND_MESSAGE;

public interface LoginAttemptService {
 default void verifyLoginAccess(String username, boolean credentialMatches){
  throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_VERIFY_ATTEMPT_CODE));
 }
}
