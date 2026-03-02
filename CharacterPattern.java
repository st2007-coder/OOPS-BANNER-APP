package com.oops.banner;

import java.util.HashMap;
import java.util.Map;

public class CharacterPattern {

    private Map<Character, String[]> patterns;

    public CharacterPattern() {
        patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    public String[] getPattern(char ch) {
        return patterns.get(Character.toUpperCase(ch));
    }
}