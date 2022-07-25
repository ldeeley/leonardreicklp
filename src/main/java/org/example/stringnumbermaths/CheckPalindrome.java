package org.example.stringnumbermaths;

public class CheckPalindrome {

    public static boolean checkPalindrome(String string){
        int charChecks = string.length()/2;
        for(int i=0; i < charChecks/2; i++){
            if (string.charAt(i)!=string.charAt(charChecks-1-i))
                return false;
        } return true;
    }

}
