package com.fewlaps.prettystrings;

import java.util.StringTokenizer;

public class PrettyString {

    public String capitalizeFirstChar(String input) {
        if (input == null || input.trim().equals("")) {
            return input;
        }

        input = input.trim().toLowerCase();

        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public String capitalizeAllFirstChars(String input) {
        if (input == null || input.trim().equals("")) {
            return input;
        }

        char[] charArray = input.trim().toLowerCase().toCharArray();

        charArray[0] = Character.toUpperCase(charArray[0]);

        for (int i = 1; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i - 1])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        return new String(charArray);
    }

    public String addColon(String input) {
        if (input == null || input.trim().equals("")) {
            return input;
        }

        return input.trim().concat(":");
    }

    public String removeEndingPeriod(String input) {
        return removeEnding(input, '.');
    }

    public String removeEndingColons(String input) {
        return removeEnding(input, ':');
    }

    public String removeEndingSemiColons(String input) {
        return removeEnding(input, ';');
    }

    private String removeEnding(String input, char endsWith) {
        if (input == null || input.trim().equals("")) {
            return "";
        }
        if (endsWith(input, endsWith)) {
            return input.substring(0, input.length() - 1);
        }
        return input;
    }

    private boolean endsWith(String input, char endsWith) {
        return input.charAt(input.length() - 1) == endsWith;
    }

    public String getFirstWords(String input, int numberOfWords) {
        if (input == null || input.trim().equals("")) {
            return "";
        }
        StringTokenizer st = new StringTokenizer(input, " ");
        if (st.countTokens() <= numberOfWords) {
            return input;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < numberOfWords; i++) {
                sb.append(st.nextToken() + " ");
            }
            return sb.toString().trim();
        }
    }
}
