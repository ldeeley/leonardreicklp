package org.example.stringnumbermaths;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCharacters {

    // Write a program that counts duplicate characters from a String

    public static List<Character> stringToListOfDupes(String string){

        Map<Character,Integer> result = new HashMap<>();
        for (int i=0; i<string.length();i++){
            Character key = string.charAt(i);
            if (result.containsKey(key)){
                result.put(key,result.get(key)+1);
            } else
                result.put(key,1);
        }

        return result.entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
