package org.example.stringnumbermaths;

import java.util.stream.Collectors;

public class RemoveGivenCharacter {

    public static String removeGivenCharacter(String string, Character character){

        return string.chars()
                .mapToObj(c->(char) c)
                .filter(c->c != character)
                .map(String::valueOf)
                .collect(Collectors.joining());

    }

}
