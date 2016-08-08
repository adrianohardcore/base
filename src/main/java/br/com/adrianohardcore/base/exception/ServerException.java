package br.com.adrianohardcore.base.exception;

import static br.com.adrianohardcore.base.exception.ExceptionConstants.SERVER_EXCEPTION;

import org.springframework.http.HttpStatus;

public class ServerException extends GenericException {

    public ServerException(String error) {
        super(SERVER_EXCEPTION);
        getExceptionBean().setMessage(String.format(SERVER_EXCEPTION.getMessage(), error));
    }

}
