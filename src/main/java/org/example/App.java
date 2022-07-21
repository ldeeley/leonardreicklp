package org.example;

import org.example.stringnumbermaths.DuplicateCharacters;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Character> result = DuplicateCharacters.stringToListOfDupes("Hello");
        System.out.println(result);
    }
}
