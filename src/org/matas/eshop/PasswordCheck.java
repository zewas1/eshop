package org.matas.eshop;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class PasswordCheck {
    public static boolean isValid(String password) {
        String passwordRegex = "((?=.*[a-zA-Z0-9_+&*-]).{8,40})";

        Pattern pat = Pattern.compile(passwordRegex);
        if (password == null){
            return false;
        } else {
            return pat.matcher(password).matches();
        }
    }
}