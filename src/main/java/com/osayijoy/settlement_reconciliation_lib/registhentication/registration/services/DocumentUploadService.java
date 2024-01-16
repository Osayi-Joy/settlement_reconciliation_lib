package com.osayijoy.settlement_reconciliation_lib.registhentication.registration.services;

import com.osayijoy.settlement_reconciliation_lib.config.helper.exception.ZeusRuntimeException;
import com.osayijoy.settlement_reconciliation_lib.config.helper.response.ApiError;

import static com.osayijoy.settlement_reconciliation_lib.registhentication.exceptions.messages.ErrorMessages.IMPLEMENTATION_NOT_FOUND_MESSAGE;
import static com.osayijoy.settlement_reconciliation_lib.registhentication.registration.exceptions.messages.DocumentUploadErrorMessages.*;

public interface DocumentUploadService<T,V>  {

   default T uploadSingleDocument(V request){
       throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_UPLOAD_SINGLE_DOCUMENT_CODE));
   }
   default T uploadMultipleDocument(V request){
       throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_UPLOAD_MULTIPLE_DOCUMENT_CODE));
   }

   default T downloadSingleDocument(V request){
       throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_DOWNLOAD_SINGLE_DOCUMENT_CODE));
   }

   default T downloadMultipleDocument(V request){
       throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_DOWNLOAD_MULTIPLE_DOCUMENT_CODE));
   }

   default T setDocumentUploadLocation(V request){
       throw new ZeusRuntimeException(new ApiError(IMPLEMENTATION_NOT_FOUND_MESSAGE,IMPLEMENTATION_NOT_FOUND_SET_DOCUMENT_UPLOAD_LOCATION_CODE));
   }


}
