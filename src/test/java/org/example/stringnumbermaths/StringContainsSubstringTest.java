package org.example.stringnumbermaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringContainsSubstringTest {

    @Test
    void stringContainsSubstring() {
        assertTrue(StringContainsSubstring.stringContainsSubstring("HelloWorld","oWo"));
        assertFalse(StringContainsSubstring.stringContainsSubstring("HelloWorld","oXo"));

    }
}