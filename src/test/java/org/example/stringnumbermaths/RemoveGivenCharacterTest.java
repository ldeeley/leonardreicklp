package org.example.stringnumbermaths;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.jupiter.api.Assertions.*;

class RemoveGivenCharacterTest {

    @Test
    void removeGivenCharacter() {

        assertThat(RemoveGivenCharacter.removeGivenCharacter("Hello",'l'),equalToIgnoringCase("Heo"));

    }
}