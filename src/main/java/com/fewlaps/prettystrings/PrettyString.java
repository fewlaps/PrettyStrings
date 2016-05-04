package com.fewlaps.prettystrings;

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
}
