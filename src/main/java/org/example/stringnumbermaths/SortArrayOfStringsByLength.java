package org.example.stringnumbermaths;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortArrayOfStringsByLength {

    public static List<String> sortArrayOfStringsByLength(ArrayList<String> myStrings){

        myStrings.sort(Comparator.comparingInt(String::length));

        return myStrings;

    }

}
