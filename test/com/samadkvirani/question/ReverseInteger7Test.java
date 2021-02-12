package com.samadkvirani.question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseInteger7Test {

    ReverseInteger7 reverseInteger = new ReverseInteger7();


    @Test
    void reversePostiveNumberTest() {
        int x = 54321;

        Assertions.assertEquals(12345, reverseInteger.reverse(x));
    }

    @Test
    public void reverseNegativeNumberTest() {
        int x = -54321;

        Assertions.assertEquals(-12345, reverseInteger.reverse(x));
    }

    @Test
    public void reverseOutOfBoundsReturnsZeroTest() {
        int x = Integer.MAX_VALUE;

        Assertions.assertEquals(0, reverseInteger.reverse(x));
    }
}