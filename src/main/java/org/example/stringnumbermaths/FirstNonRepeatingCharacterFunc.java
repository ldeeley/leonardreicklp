package org.example.stringnumbermaths;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterFunc {

    public static Character firstNonRepeatingChar(String string){

        Map<Character,Integer> result;

        result = string.
                chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.toMap(Function.identity(), string::indexOf, (v1,v2)-> -1 , LinkedHashMap::new));

       return result.
                    entrySet().stream().filter(x->x.getValue()>-1).findFirst().get().getKey();
    }

}
