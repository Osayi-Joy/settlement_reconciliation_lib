package com.osayijoy.settlement_reconciliation_lib.registhentication.registration.services;


import com.osayijoy.settlement_reconciliation_lib.config.helper.exception.ZeusRuntimeException;
import com.osayijoy.settlement_reconciliation_lib.config.helper.response.ApiError;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.exceptions.messages.ErrorMessages.IMPLEMENTATION_NOT_FOUND_MESSAGE;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.registration.exceptions.messages.RegistrationErrorMessages.IMPLEMENTATION_NOT_FOUND_CREATE_USER_PROFILE_CODE;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.registration.exceptions.messages.RegistrationErrorMessages.IMPLEMENTATION_NOT_FOUND_PROFILE_CHECKS_CODE;

public interface RegistrationService<T,V> {

    default T createProfile(V request){
         throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_CREATE_USER_PROFILE_CODE));
    }


    default boolean profileExistenceCheckByEmail(String email){
        throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_PROFILE_CHECKS_CODE));
    }
}
