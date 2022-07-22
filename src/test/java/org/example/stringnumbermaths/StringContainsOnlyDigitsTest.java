package org.example.stringnumbermaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringContainsOnlyDigitsTest {

    @Test
    void stringContainsOnlyDigits() {

        assertTrue(StringContainsOnlyDigits.stringContainsOnlyDigits("12346"));
        assertFalse(StringContainsOnlyDigits.stringContainsOnlyDigits("123x45"));
        assertFalse(StringContainsOnlyDigits.stringContainsOnlyDigits("123 45"));

    }
}