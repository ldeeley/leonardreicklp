package org.example.stringnumbermaths;

import org.hamcrest.collection.IsArrayWithSize;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsArrayWithSize.arrayWithSize;
import static org.junit.jupiter.api.Assertions.*;

class FindCharacterMostAppearancesTest {

    @Test
    void findCharacterMostAppearances() {
        assertThat(FindCharacterMostAppearances.findCharacterMostAppearances("Hellllo"), hasSize(1));
        Map.Entry<Character,Long> myEntry = new Map.Entry<>() {
            @Override
            public Character getKey() {
                return 'l';
            }

            @Override
            public Long getValue() {
                return 4L;
            }

            @Override
            public Long setValue(Long value) {
                return null;
            }
        };
        Map.Entry<Character,Long> myOEntry = new Map.Entry<>() {
            @Override
            public Character getKey() {
                return 'o';
            }

            @Override
            public Long getValue() {
                return 4L;
            }

            @Override
            public Long setValue(Long value) {
                return null;
            }
        };
        assertThat(FindCharacterMostAppearances.findCharacterMostAppearances("Hellllo"), hasItem(myEntry));
        assertThat(FindCharacterMostAppearances.findCharacterMostAppearances("Helllloooo"), hasItem(myOEntry));

    }
}