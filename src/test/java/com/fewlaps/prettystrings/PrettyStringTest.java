package com.fewlaps.prettystrings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class PrettyStringTest {

    private PrettyString prettyString;

    @Before
    public void init() {
        prettyString = new PrettyString();
    }

    @Test
    public void shouldCapitalizeFirstChar_whenPrettifyingAllCapsString() throws Exception {
        assertTrue(prettyString.capitalizeFirstChar("JUST A SAMPLE STRING").equals("Just a sample string"));
    }

    @Test
    public void shouldCapitalizeFirstChar_whenPrettifyingAllLowerCaseString() throws Exception {
        assertTrue(prettyString.capitalizeFirstChar("just a sample string").equals("Just a sample string"));
    }

    @Test
    public void shouldCapitalizeFirstChar_whenPrettifyingMixedCasesString() throws Exception {
        assertTrue(prettyString.capitalizeFirstChar("jUSt a SAMplE stRInG").equals("Just a sample string"));
    }

    @Test
    public void shouldCapitalizeFirstChar_whenPrettifyingMixedCasesWithSpacesString() throws Exception {
        assertTrue(prettyString.capitalizeFirstChar(" JusT A sampLE sTrIng ").equals("Just a sample string"));
    }

    @Test
    public void shouldCapitalizeFirstCharOfEveryWord_whenPrettifyingAllCapsString() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstChars("JUST A SAMPLE STRING").equals("Just A Sample String"));
    }

    @Test
    public void shouldCapitalizeFirstCharOfEveryWord_whenPrettifyingAllLowerCaseString() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstChars("just a sample string").equals("Just A Sample String"));
    }

    @Test
    public void shouldCapitalizeFirstCharOfEveryWord_whenPrettifyingMixedCasesString() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstChars("jUSt a SAMplE stRInG").equals("Just A Sample String"));
    }

    @Test
    public void shouldCapitalizeFirstCharOfEveryWord_whenPrettifyingMixedCasesWithSpacesString() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstChars(" JusT A sampLE sTrIng ").equals("Just A Sample String"));
    }

    @Test
    public void capitalizeFirstCharShouldReturnSameValue_ifStringIsNull() throws Exception {
        assertNull(prettyString.capitalizeFirstChar(null));
    }

    @Test
    public void capitalizeFirstCharShouldReturnSameValue_ifStringIsEmpty() throws Exception {
        assertTrue(prettyString.capitalizeFirstChar("").equals(""));
    }

    @Test
    public void capitalizeAllFirstCharsShouldReturnSameValue_ifStringIsNull() throws Exception {
        assertNull(prettyString.capitalizeAllFirstChars(null));
    }

    @Test
    public void capitalizeAllFirstCharsShouldReturnSameValue_ifStringIsEmpty() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstChars("").equals(""));
    }

    @Test
    public void capitalizeFirstCharShouldReturnSameValue_ifHasNoLetters() throws Exception {
        assertTrue(prettyString.capitalizeFirstChar("42- !·$").equals("42- !·$"));
    }

    @Test
    public void capitalizeAllFirstCharsShouldReturnSameValue_ifHasNoLetters() throws Exception {
        assertTrue(prettyString.capitalizeAllFirstChars("42- !·$").equals("42- !·$"));
    }
}
