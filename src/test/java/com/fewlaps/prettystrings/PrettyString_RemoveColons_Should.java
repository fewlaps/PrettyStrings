package com.fewlaps.prettystrings;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrettyString_RemoveColons_Should {

    private PrettyString prettyString;

    @Before
    public void init() {
        prettyString = new PrettyString();
    }

    @Test
    public void work_whenInputHasEndingColons() throws Exception {
        String input = "Some text:";
        String output = prettyString.removeEndingColons(input);
        assertThat(output).isEqualTo("Some text");
    }

    @Test
    public void work_whenInputHasNotEndingColons() throws Exception {
        String input = "Some text";
        String output = prettyString.removeEndingColons(input);
        assertThat(output).isEqualTo("Some text");
    }

    @Test
    public void returnBlank_whenInputIsNull() throws Exception {
        String input = null;
        String output = prettyString.removeEndingColons(input);
        assertThat(output).isEqualTo("");
    }

    @Test
    public void returnBlank_whenInputIsBlank() throws Exception {
        String input = "";
        String output = prettyString.removeEndingColons(input);
        assertThat(output).isEqualTo("");
    }

    @Test
    public void returnBlank_whenInputIsWhitespace() throws Exception {
        String input = " ";
        String output = prettyString.removeEndingColons(input);
        assertThat(output).isEqualTo("");
    }
}