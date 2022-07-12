package com.company.exception;

import javax.security.auth.login.LoginException;

public class WrongLoginException extends LoginException {

    public WrongLoginException() {
        super("Дли логина более 20 символов");
    }

    public WrongLoginException (String message) {
         super(message);
     }
}
