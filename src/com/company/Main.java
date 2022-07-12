package com.company;

import com.company.exception.WrongLoginException;
import com.company.exception.WrongPasswordException;


public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(isCheck("asddd","asd","asd"));
    }

    public static boolean isCheck (String login, String password, String confirmPassword ) throws Exception   {

        try {
            boolean str1 = login.matches("[a-zA-Z0-9_]+");
            boolean str2 = login.matches("^[a-zA-Z0-9_]{0,20}$");
            boolean str3 = password.matches("^[a-zA-Z0-9_]{0,20}$");
            if (str1 == false) {
                throw new WrongLoginException("Пароль должен содержать латинские буквы, цифры и знак подчеркивания");
            } else if (str2 == false) {
                throw new WrongLoginException();
            } else if (str3 == false) {
                throw new WrongPasswordException("Пароль должен содержать латинские буквы, цифры и знак подчеркивания");
            } else if (password != confirmPassword) {
                throw new WrongPasswordException();
            }
            return true;
        }  catch (WrongLoginException e) {
            e.printStackTrace();
            return false;
        }  catch (WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }

    }

}
