package org.example.stringnumbermaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToLongTest {

    @Test
    void stringToLong() {

        assertEquals(StringToLong.stringToLong("55555555555555555"),55555555555555555L);

    }
}