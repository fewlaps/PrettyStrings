package com.fewlaps.prettystrings;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrettyString_GetFirstWords_Should {

    private PrettyString prettyString;

    @Before
    public void init() {
        prettyString = new PrettyString();
    }

    @Test
    public void returnBlank_whenInputIsNull_andParamSays3Words() throws Exception {
        String input = null;
        String output = prettyString.getFirstWords(input, 3);
        assertThat(output).isEqualTo("");
    }

    @Test
    public void returnBlank_whenInputIsBlank_andParamSays3Words() throws Exception {
        String input = "";
        String output = prettyString.getFirstWords(input, 3);
        assertThat(output).isEqualTo("");
    }

    @Test
    public void work_whenInputHasOneWord_andParamSays3Words() throws Exception {
        String input = "Hello";
        String output = prettyString.getFirstWords(input, 3);
        assertThat(output).isEqualTo("Hello");
    }

    @Test
    public void work_whenInputHasTwoWords_andParamSays3Words() throws Exception {
        String input = "Hello Roc";
        String output = prettyString.getFirstWords(input, 3);
        assertThat(output).isEqualTo("Hello Roc");
    }

    @Test
    public void work_whenInputHasThreeWords_andParamSays3Words() throws Exception {
        String input = "Hello Roc Boronat";
        String output = prettyString.getFirstWords(input, 3);
        assertThat(output).isEqualTo("Hello Roc Boronat");
    }

    @Test
    public void work_whenInputHasFourWords_andParamSays3Words() throws Exception {
        String input = "Hello Roc Boronat López";
        String output = prettyString.getFirstWords(input, 3);
        assertThat(output).isEqualTo("Hello Roc Boronat");
    }

    @Test
    public void work_whenInputHasFourWords_andParamSays1Word() throws Exception {
        String input = "Hello Roc Boronat López";
        String output = prettyString.getFirstWords(input, 1);
        assertThat(output).isEqualTo("Hello");
    }

    @Test
    public void returnBlank_whenInputHasFourWords_andParamSays0Words() throws Exception {
        String input = "Hello Roc Boronat López";
        String output = prettyString.getFirstWords(input, 0);
        assertThat(output).isEqualTo("");
    }
}