package org.example;

import org.example.stringnumbermaths.DuplicateCharacters;
import org.example.stringnumbermaths.DuplicateCharactersFunc;
import org.example.stringnumbermaths.FirstNonRepeatingCharacter;
import org.example.stringnumbermaths.FirstNonRepeatingCharacterFunc;

import java.util.Arrays;
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
//        List<Character> result = DuplicateCharacters.stringToListOfDupes("Hello");
//        List<Character> result = DuplicateCharactersFunc.stringToListOfDupes("Hello");
//        System.out.println(FirstNonRepeatingCharacter.firstNonRepeatingChar(""));
        System.out.println(FirstNonRepeatingCharacterFunc.firstNonRepeatingChar("helloh"));
    }
}
