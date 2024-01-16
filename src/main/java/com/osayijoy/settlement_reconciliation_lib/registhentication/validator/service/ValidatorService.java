package com.osayijoy.settlement_reconciliation_lib.registhentication.validator.service;


public interface ValidatorService<T,V> {

    T validatePhoneVerificationCode(V request);
    T validateEmailVerificationCode(V request);

    T validatePassword(V request);
}
