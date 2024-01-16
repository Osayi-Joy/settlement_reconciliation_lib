package com.osayijoy.settlement_reconciliation_lib.registhentication.exceptions;


import com.osayijoy.settlement_reconciliation_lib.config.helper.exception.ZeusRuntimeException;
import com.osayijoy.settlement_reconciliation_lib.config.helper.response.ApiError;
import org.springframework.http.HttpStatus;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.exceptions.messages.ErrorMessages.IMPLEMENTATION_NOT_FOUND_AUTHENTICATION_FAILED_CODE;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.exceptions.messages.ErrorMessages.IMPLEMENTATION_NOT_FOUND_MESSAGE;

public interface ExceptionHandler<M,C,H,T> {

    void processBadRequestException(M message,C code,T throwAbleMessage);
    ZeusRuntimeException processBadRequestException(M message, C code);
    void processInternalException(M message,C code,T throwAbleMessage);
    default void processAuthenticationFailedException(M message,C code,H httpStatus,T throwAbleMessage){
        throw new ZeusRuntimeException(HttpStatus.INTERNAL_SERVER_ERROR, new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_AUTHENTICATION_FAILED_CODE));
    }
    void processCustomException(M message,C code,H httpStatus,T throwAbleMessage);
    ZeusRuntimeException processCustomException(M message,C code,H httpStatus);

}
