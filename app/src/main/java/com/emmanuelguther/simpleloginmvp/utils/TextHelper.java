package com.emmanuelguther.simpleloginmvp.utils;

/**
 * Created by emmanuelgh on 6/8/17.
 */

public class TextHelper {

    public static boolean isTextEmpty(String text) {
        if (text != null && !text.equals("")) {
            return false;

        } else {
            return true;
        }
    }

    public static boolean containsWhiteSpace(final String testCode){
        if(testCode != null){
            for(int i = 0; i < testCode.length(); i++){
                if(Character.isWhitespace(testCode.charAt(i))){
                    return true;
                }
            }
        }
        return false;
    }
}
