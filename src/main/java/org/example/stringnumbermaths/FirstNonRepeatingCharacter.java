package org.example.stringnumbermaths;

import java.util.Arrays;

public class FirstNonRepeatingCharacter {

    public static Character firstNonRepeatingChar(String string){

        final int alphabetSize = 26;

        if (string.length()==0) return '!';

        int[] letterFoundInString = new int[alphabetSize];
        //initialize - set all letters to not found = -1
        Arrays.fill(letterFoundInString,-1);

        String lowerString = string.toLowerCase();
        for (int i=0; i< string.length();i++){
            int myChar = lowerString.charAt(i)-97;
            // if never seen before then insert
            if (letterFoundInString[myChar] == -1){
                letterFoundInString[myChar] = i;
            } else
            // it's not unique
                letterFoundInString[myChar] = -2;
        }

        int min = alphabetSize;
        int minIndex = 0;
        for (int i=0; i<letterFoundInString.length; i++){
            if (letterFoundInString[i] > -1) {
//                it's a non-repeating character
                if (letterFoundInString[i] < min) {
                    minIndex = i;
                    min = letterFoundInString[i];
                }
            }
        }
        if (minIndex == 0) return  '!';
        else return (char) (minIndex+97);
    }

}
