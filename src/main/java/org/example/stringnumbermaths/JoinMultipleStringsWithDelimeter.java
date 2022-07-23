package org.example.stringnumbermaths;

import java.util.List;
import java.util.stream.Collectors;

public class JoinMultipleStringsWithDelimeter {

    public static String joinMultipleStringsWithDelimeter(List<String> stringList,String delimeter){

        return String.join(delimeter, stringList);
    }
}
