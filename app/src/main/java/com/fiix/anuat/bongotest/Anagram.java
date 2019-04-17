package com.fiix.anuat.bongotest;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String firstString, String secondString){
        boolean result=false;
        if(firstString != null && !firstString.isEmpty() && secondString != null && !secondString.isEmpty()){
            if (firstString.trim().length()==secondString.trim().length()) {
                char[] charArray1 = firstString.toCharArray();
                Arrays.sort(charArray1);
                char[] charArray2 = secondString.toCharArray();
                Arrays.sort(charArray2);
                result = Arrays.equals(charArray1,charArray2);
            }
        }
        return result;
    }
}
