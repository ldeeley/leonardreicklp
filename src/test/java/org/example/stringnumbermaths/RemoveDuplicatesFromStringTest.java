package org.example.stringnumbermaths;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromStringTest {

    @Test
    void removeDuplciatesFromString() {

        assertThat(RemoveDuplicatesFromString.removeDuplciatesFromString("Hello"),equalToIgnoringCase("helo"));


    }
}