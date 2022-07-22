package org.example.stringnumbermaths;

public class CountVowelsInString {

    public static int countVowelsInString(String string){
        String onlyVowels = string.replaceAll("[^aeiou]","");

        return onlyVowels.length();
    }

}
