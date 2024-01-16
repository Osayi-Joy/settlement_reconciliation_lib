package com.osayijoy.settlement_reconciliation_lib.registhentication.registration.services;


import com.osayijoy.settlement_reconciliation_lib.config.helper.exception.ZeusRuntimeException;
import com.osayijoy.settlement_reconciliation_lib.config.helper.response.ApiError;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.exceptions.messages.ErrorMessages.IMPLEMENTATION_NOT_FOUND_MESSAGE;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.registration.exceptions.messages.NotificationErrorMessages.IMPLEMENTATION_NOT_FOUND_SEND_VERIFICATION_CODE_TO_EMAIL_CODE;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.registration.exceptions.messages.NotificationErrorMessages.IMPLEMENTATION_NOT_FOUND_SEND_VERIFICATION_CODE_TO_PHONE_CODE;

public interface NotificationService<T,V>  {

   default T sendVerificationCodeToPhone(V request){
       throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_SEND_VERIFICATION_CODE_TO_PHONE_CODE));
   }
    default T sendVerificationCodeToEmail(V request){
        throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_SEND_VERIFICATION_CODE_TO_EMAIL_CODE));
    }
}
