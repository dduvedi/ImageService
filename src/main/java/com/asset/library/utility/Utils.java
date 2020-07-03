package com.asset.library.utility;

public class Utils {

    public static boolean isStringOnlyAlphabet(String str) {
        return ((!str.equals(""))&&(str != null)&&
        (str.matches("^[a-zA-Z]*$")));
    }
}
