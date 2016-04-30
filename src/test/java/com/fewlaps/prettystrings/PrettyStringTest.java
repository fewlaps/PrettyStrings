package com.fewlaps.prettystrings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PrettyStringTest {
    private String allCapsString = "JUST A SAMPLE STRING";
    private String allLowCaseString = "just a sample string";
    private String mixedCasesString = "jUSt a SAMplE stRInG";
    private String mixedCasesWithSpacesString = " JusT A sampLE sTrIng ";

    private PrettyString prettyString;

    @Before
    public void init() {
        prettyString = new PrettyString();
    }

    @Test
    public void shouldCapitalizeFirstLetter() throws Exception {

        String expectedResult = "Just a sample string";

        assertTrue(prettyString.capitalizeFirstLetter(allCapsString).equals(expectedResult));
        assertTrue(prettyString.capitalizeFirstLetter(allLowCaseString).equals(expectedResult));
        assertTrue(prettyString.capitalizeFirstLetter(mixedCasesString).equals(expectedResult));
        assertTrue(prettyString.capitalizeFirstLetter(mixedCasesWithSpacesString).equals(expectedResult));
    }

    @Test
    public void shouldCapitalizeFirstLetterOfEveryWord() throws Exception {

        String expectedResult = "Just A Sample String";

        assertTrue(prettyString.capitalizeAllFirstLetters(allCapsString).equals(expectedResult));
        assertTrue(prettyString.capitalizeAllFirstLetters(allLowCaseString).equals(expectedResult));
        assertTrue(prettyString.capitalizeAllFirstLetters(mixedCasesString).equals(expectedResult));
        assertTrue(prettyString.capitalizeAllFirstLetters(mixedCasesWithSpacesString).equals(expectedResult));
    }

    @Test
    public void shouldReturnSameValue_ifStringIsNullOrEmpty() throws Exception {
        String nullString = null;
        String emptyString = "";
        String oneSpaceString = " ";

        assertTrue(prettyString.capitalizeFirstLetter(nullString) == nullString);
        assertTrue(prettyString.capitalizeFirstLetter(emptyString).equals(emptyString));
        assertTrue(prettyString.capitalizeFirstLetter(oneSpaceString).equals(oneSpaceString));

        assertTrue(prettyString.capitalizeAllFirstLetters(nullString) == nullString);
        assertTrue(prettyString.capitalizeAllFirstLetters(emptyString).equals(emptyString));
        assertTrue(prettyString.capitalizeAllFirstLetters(oneSpaceString).equals(oneSpaceString));
    }

    @Test
    public void shouldReturnSameValue_ifHasNoLetters() throws Exception {
        String noLettersString = "42- !·$";

        assertTrue(prettyString.capitalizeFirstLetter(noLettersString).equals(noLettersString));
        assertTrue(prettyString.capitalizeAllFirstLetters(noLettersString).equals(noLettersString));
    }
}