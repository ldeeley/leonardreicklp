package org.example.stringnumbermaths;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLettersOfWordTest {

    @Test
    void reverseLettersOfAWord() {

        assertThat(ReverseLettersOfWord.reverseLettersOfAWord("goodbye cruel world"),equalToIgnoringCase("eybdoog leurc dlrow"));

    }
}