package org.example.stringnumbermaths;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingCharacterTest {

    @Test
    void firstNonRepeatingChar() {

        assertEquals(FirstNonRepeatingCharacter.firstNonRepeatingChar("hello"),'h');

    }

    @Test
    void norepeatsfirstNonRepeatingChar() {

        assertEquals(FirstNonRepeatingCharacter.firstNonRepeatingChar("hheellpp"),'!');

    }

    @Test
    void firstNonRepeatingCharFunc() {

        assertEquals(FirstNonRepeatingCharacterFunc.firstNonRepeatingChar("hello"),'h');

    }

    @Test
    void norepeatsfirstNonRepeatingCharFunc() {

        assertThrows(NoSuchElementException.class,()->FirstNonRepeatingCharacterFunc.firstNonRepeatingChar("hheellpp"));

    }
}