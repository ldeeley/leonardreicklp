package org.example.stringnumbermaths;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.jupiter.api.Assertions.*;

class JoinMultipleStringsWithDelimeterTest {

    @Test
    void joinMultipleStringsWithDelimeter1() {
        //initialise ArrayList method 1
        ArrayList<String> myStringList = new ArrayList<>();
        myStringList.add("Lester");
        myStringList.add("Jessica");
        myStringList.add("Coco");

        assertThat(JoinMultipleStringsWithDelimeter
                .joinMultipleStringsWithDelimeter(myStringList,"X"),
                equalToIgnoringCase("LesterXJessicaXCoco"));
    }

    @Test
    void joinMultipleStringsWithDelimeter2() {
        //initialise ArrayList method 2
        assertThat(JoinMultipleStringsWithDelimeter
                .joinMultipleStringsWithDelimeter(new ArrayList<>(Arrays.asList("Lester", "Jessica", "Coco")),"X"),
                equalToIgnoringCase("LesterXJessicaXCoco"));
    }

    @Test
    void joinMultipleStringsWithDelimeter3() {
        //initialise ArrayList method 3
        ArrayList<String> myStringList = new ArrayList<>(List.of("Lester","Jessica","Coco"));
        assertThat(JoinMultipleStringsWithDelimeter
                .joinMultipleStringsWithDelimeter(myStringList,"X"),
                equalToIgnoringCase("LesterXJessicaXCoco"));
    }

    @Test
    void joinMultipleStringsWithDelimeter4() {
        //initialise ArrayList method 4 - from another Collection

        List<String> myStringList = Stream.of("Lester", "Jessica", "Coco").distinct().collect(Collectors.toList());

        assertThat(JoinMultipleStringsWithDelimeter
                .joinMultipleStringsWithDelimeter(myStringList,"X"),
                equalToIgnoringCase("LesterXJessicaXCoco"));
    }
}