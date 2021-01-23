package com.samadkvirani.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringWithoutRepeatingCharacters3Test {

    LongestSubstringWithoutRepeatingCharacters3 longest = new LongestSubstringWithoutRepeatingCharacters3();

    @Test
    public void blankStringTest() {
        String s = "";

        int x = longest.lengthOfLongestSubstring(s);

        assertEquals(0, x);
    }

    @Test
    public void example1Test() {
        String s = "abcabcbb";

        int x = longest.lengthOfLongestSubstring(s);

        assertEquals(3, x);
    }
}
