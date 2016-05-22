package com.fewlaps.prettystrings;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrettyStringTest {

    private PrettyString prettyString;

    @Before
    public void init() {
        prettyString = new PrettyString();
    }

    @Test
    public void capitalizeFirstCharShouldReturnSameValue_ifStringIsNull() throws Exception {
        String input = null;

        String output = prettyString.capitalizeFirstChar(input);

        assertThat(output).isNull();
    }

    @Test
    public void capitalizeAllFirstCharsShouldReturnSameValue_ifStringIsNull() throws Exception {
        String input = null;

        String output = prettyString.capitalizeAllFirstChars(input);

        assertThat(output).isNull();
    }

    @Test
    public void addColonShouldReturnSameValue_ifStringIsNull() throws Exception {
        String input = null;

        String output = prettyString.addColon(input);

        assertThat(output).isNull();
    }

    @Test
    public void shouldCapitalizeFirstChar_whenPrettifyingAllCapsString() throws Exception {
        String input = "JUST A SAMPLE STRING";
        String expectedOutput = "Just a sample string";

        String output = prettyString.capitalizeFirstChar(input);

        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldCapitalizeFirstChar_whenPrettifyingAllLowerCaseString() throws Exception {
        String input = "just a sample string";
        String expectedOutput = "Just a sample string";

        String output = prettyString.capitalizeFirstChar(input);

        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldCapitalizeFirstChar_whenPrettifyingMixedCasesString() throws Exception {
        String input = "jUSt a SAMplE stRInG";
        String expectedOutput = "Just a sample string";

        String output = prettyString.capitalizeFirstChar(input);

        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldCapitalizeFirstChar_whenPrettifyingMixedCasesWithSpacesString() throws Exception {
        String input = " JusT A sampLE sTrIng ";
        String expectedOutput = "Just a sample string";

        String output = prettyString.capitalizeFirstChar(input);

        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldCapitalizeFirstCharOfEveryWord_whenPrettifyingAllCapsString() throws Exception {
        String input = "JUST A SAMPLE STRING";
        String expectedOutput = "Just A Sample String";

        String output = prettyString.capitalizeAllFirstChars(input);

        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldCapitalizeFirstCharOfEveryWord_whenPrettifyingAllLowerCaseString() throws Exception {
        String input = "just a sample string";
        String expectedOutput = "Just A Sample String";

        String output = prettyString.capitalizeAllFirstChars(input);

        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldCapitalizeFirstCharOfEveryWord_whenPrettifyingMixedCasesString() throws Exception {
        String input = "jUSt a SAMplE stRInG";
        String expectedOutput = "Just A Sample String";

        String output = prettyString.capitalizeAllFirstChars(input);

        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldCapitalizeFirstCharOfEveryWord_whenPrettifyingMixedCasesWithSpacesString() throws Exception {
        String input = " JusT A sampLE sTrIng ";
        String expectedOutput = "Just A Sample String";

        String output = prettyString.capitalizeAllFirstChars(input);

        assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    public void capitalizeFirstCharShouldReturnSameValue_ifStringIsEmpty() throws Exception {
        String input = "";

        String output = prettyString.capitalizeFirstChar(input);

        assertThat(output).isEqualTo(input);
    }

    @Test
    public void capitalizeAllFirstCharsShouldReturnSameValue_ifStringIsEmpty() throws Exception {
        String input = "";

        String output = prettyString.capitalizeAllFirstChars(input);

        assertThat(output).isEqualTo(input);
    }

    @Test
    public void addColonShouldReturnSameValue_ifStringIsEmpty() throws Exception {
        String input = "";

        String output = prettyString.addColon(input);

        assertThat(output).isEqualTo(input);
    }

    @Test
    public void capitalizeFirstCharShouldReturnSameValue_ifHasNoLetters() throws Exception {
        String input = "42- !·$";

        String output = prettyString.capitalizeFirstChar(input);

        assertThat(output).isEqualTo(input);
    }

    @Test
    public void capitalizeAllFirstCharsShouldReturnSameValue_ifHasNoLetters() throws Exception {
        String input = "42- !·$";

        String output = prettyString.capitalizeAllFirstChars(input);

        assertThat(output).isEqualTo(input);
    }

    @Test
    public void addColonShouldAddColon_whenUsingAValidString() throws Exception {
        String input = "Some text";
        String expectedOutput = "Some text:";

        String output = prettyString.addColon(input);

        assertThat(output).isEqualTo(expectedOutput);
    }
}