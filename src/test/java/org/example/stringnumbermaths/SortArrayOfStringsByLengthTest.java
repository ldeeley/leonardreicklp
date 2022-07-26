package org.example.stringnumbermaths;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.*;

class SortArrayOfStringsByLengthTest {

    @Test
    void sortArrayOfStringsByLength() {

        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Lester", "Jessiebopper", "Gill", "Luke", "Cocobops"));
        assertThat(SortArrayOfStringsByLength.sortArrayOfStringsByLength(myList),contains("Gill","Luke","Lester","Cocobops","Jessiebopper"));
    }
}