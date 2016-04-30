package com.fewlaps.prettystrings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PrettyStringTest {

    private PrettyString prettyString;

    @Before
    public void init() {
        prettyString = new PrettyString();
    }

    @Test
    public void shouldCapitalizeFirstLetter_whenPrettifyingAllCapsString() throws Exception {
        assertTrue(prettyString.capitalizeFirstLetter("JUST A SAMPLE STRING").equals("Just a sample string"));
    }

    @Test
    public void shouldCapitalizeFirstLetter_whenPrettifyingAllLowerCaseString() throws Exception {
        assertTrue(prettyString.capitalizeFirstLetter("just a sample string").equals("Just a sample string"));
    }

    @Test
    public void shouldCapitalizeFirstLetter_whenPrettifyingMixedCasesString() throws Exception {
        assertTrue(prettyString.capitalizeFirstLetter("jUSt a SAMplE stRInG").equals("Just a sample string"));
    }

    @Test
    public void shouldCapitalizeFirstLetter_whenPrettifyingMixedCasesWithSpacesString() throws Exception {
        assertTrue(prettyString.capitalizeFirstLetter(" JusT A sampLE sTrIng ").equals("Just a sample string"));
    }

    @Test
    public void shouldCapitalizeFirstLetterOfEveryWord_whenPrettifyingAllCapsString() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstLetters("JUST A SAMPLE STRING").equals("Just A Sample String"));
    }

    @Test
    public void shouldCapitalizeFirstLetterOfEveryWord_whenPrettifyingAllLowerCaseString() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstLetters("just a sample string").equals("Just A Sample String"));
    }

    @Test
    public void shouldCapitalizeFirstLetterOfEveryWord_whenPrettifyingMixedCasesString() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstLetters("jUSt a SAMplE stRInG").equals("Just A Sample String"));
    }

    @Test
    public void shouldCapitalizeFirstLetterOfEveryWord_whenPrettifyingMixedCasesWithSpacesString() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstLetters(" JusT A sampLE sTrIng ").equals("Just A Sample String"));
    }

    @Test
    public void capitalizeFirstLetterShouldReturnSameValue_ifStringIsNull() throws Exception {
        assertTrue(prettyString.capitalizeFirstLetter(null) == null);
    }

    @Test
    public void capitalizeFirstLetterShouldReturnSameValue_ifStringIsEmpty() throws Exception {
        assertTrue(prettyString.capitalizeFirstLetter("").equals(""));
    }

    @Test
    public void capitalizeAllFirstLettersShouldReturnSameValue_ifStringIsNull() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstLetters(null) == null);
    }

    @Test
    public void capitalizeAllFirstLettersShouldReturnSameValue_ifStringIsEmpty() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstLetters("").equals(""));
    }

    @Test
    public void capitalizeFirstLetterShouldReturnSameValue_ifHasNoLetters() throws Exception {
        assertTrue(prettyString.capitalizeFirstLetter("42- !·$").equals("42- !·$"));
    }

    @Test
    public void capitalizeAllFirstLettersShouldReturnSameValue_ifHasNoLetters() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstLetters("42- !·$").equals("42- !·$"));
    }
}