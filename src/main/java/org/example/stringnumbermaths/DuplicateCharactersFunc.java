package org.example.stringnumbermaths;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DuplicateCharactersFunc {

    public static List<Character> stringToListOfDupes(String string){

        Map<Character,Long> result =  string.
                chars()
                .mapToObj(c->(char) c)
                .collect(groupingBy(Function.identity(),counting()));

        return result.entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

    }

}
