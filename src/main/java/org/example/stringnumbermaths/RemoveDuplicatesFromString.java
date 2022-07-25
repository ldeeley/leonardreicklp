package org.example.stringnumbermaths;

import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

    public static String removeDuplciatesFromString(String string){

        return string.
                chars()
                .mapToObj(c->(char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());

    }

}
