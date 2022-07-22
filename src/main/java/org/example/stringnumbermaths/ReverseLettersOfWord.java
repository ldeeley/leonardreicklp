package org.example.stringnumbermaths;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseLettersOfWord {

    //Write a program that reverses the letters of each word

    public static String reverseLettersOfAWord(String string){

        String result = Arrays.stream(string.split("\s"))
                .map(x->new StringBuilder(x).reverse())
                .collect(Collectors.joining(" "));

        return result;
    }

}
