package com.company.exception;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {
        super("Пароли не совпадают");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
