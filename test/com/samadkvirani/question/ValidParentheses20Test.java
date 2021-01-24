package com.samadkvirani.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParentheses20Test {

    ValidParentheses20 valid = new ValidParentheses20();

    @Test
    public void singleParenthesisTest() {
        String s = "()";

        boolean returned = valid.isValid(s);

        assertEquals(true, returned);

    }

    @Test
    public void threeParenthesesTest() {
        String s = "()[]{}";

        boolean returned = valid.isValid(s);

        assertEquals(true, returned);

    }

    @Test
    public void incorrectParenthesesTest() {
        String s = "(]";

        boolean returned = valid.isValid(s);

        assertEquals(false, returned);

    }

    @Test
    public void incorrectParenthesesIntertwinedTest() {
        String s = "([)]";

        boolean returned = valid.isValid(s);

        assertEquals(false, returned);

    }

    @Test
    public void nestedParenthesesTest() {
        String s = "{[]}";

        boolean returned = valid.isValid(s);

        assertEquals(true, returned);

    }

    @Test
    public void leftSideInBetweenTest() {
        String s = "(])";

        boolean returned = valid.isValid(s);

        assertEquals(false, returned);
    }

    @Test
    public void oneCharacterTest() {
        String s = "]";

        boolean returned = valid.isValid(s);

        assertEquals(false, returned);
    }
    @Test
    public void twoCharacterWrongTest() {
        String s = "(]";

        boolean returned = valid.isValid(s);

        assertEquals(false, returned);
    }

}