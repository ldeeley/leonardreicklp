package org.example.stringnumbermaths;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindCharacterMostAppearances {

    public static List<Map.Entry<Character, Long>> findCharacterMostAppearances(String string){
        Map<Character,Long> myMap =  string
                .chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Long myMaxCharacter = myMap.values().stream()
                .max(Long::compare).orElse(0L);

        Predicate<Long> predicate = aLong -> aLong.equals(myMaxCharacter);

        List<Map.Entry<Character,Long>> result =      myMap.
                    entrySet()
                .stream()
                .filter(x->predicate.test(x.getValue()))
                .collect(Collectors.toList());

        System.out.println("wait here");

        return result;
    }

}
