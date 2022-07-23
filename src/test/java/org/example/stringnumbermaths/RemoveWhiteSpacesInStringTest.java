package org.example.stringnumbermaths;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class RemoveWhiteSpacesInStringTest {

    @Test
    void removeWhiteSpacesInString() {

        assertThat(RemoveWhiteSpacesInString.removeWhiteSpacesInString("Goodbye  Cru el World "),equalToIgnoringCase("GoodbyeCruelWorld"));

    }
}