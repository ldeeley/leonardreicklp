package org.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyCollectionOf;
import static org.hamcrest.Matchers.hasItems;


import org.example.stringnumbermaths.DuplicateCharacters;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void containsOnlyOneDupe()
    {
        List<Character> testList = DuplicateCharacters.stringToListOfDupes("hello");
        assertThat(testList,hasItems('l'));
    }

    @Test
    public void containsMoreThanOneDupe()
    {
        List<Character> testList = DuplicateCharacters.stringToListOfDupes("heelloo");
        assertThat(testList,hasItems('e','l','o'));
    }

    @Test
    @Tag("Func")
    public void containsZeroDupesFunc()
    {
        List<Character> testList = DuplicateCharacters.stringToListOfDupes("helo");
        assertThat(testList, IsEmptyCollection.empty());
    }
    @Test
    @Tag("Func")
    public void containsOnlyOneDupeFunc()
    {
        List<Character> testList = DuplicateCharacters.stringToListOfDupes("hello");
        assertThat(testList,hasItems('l'));
    }

    @Test
    @Tag("Func")
    public void containsMoreThanOneDupeFunc()
    {
        List<Character> testList = DuplicateCharacters.stringToListOfDupes("heelloo");
        assertThat(testList,hasItems('e','l','o'));
    }

    @Test
    public void containsZeroDupes()
    {
        List<Character> testList = DuplicateCharacters.stringToListOfDupes("helo");
        assertThat(testList, IsEmptyCollection.empty());
    }
}
