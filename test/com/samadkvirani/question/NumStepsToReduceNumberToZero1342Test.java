package com.samadkvirani.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumStepsToReduceNumberToZero1342Test {

    NumStepsToReduceNumberToZero1342 numSteps = new NumStepsToReduceNumberToZero1342();

    @Test
    public void example1Test() {
        int num = 14;

        int result = numSteps.numberOfSteps(num);

        assertEquals(6, result);
    }

    @Test
    public void example2Test() {
        int num = 8;

        int result = numSteps.numberOfSteps(num);

        assertEquals(4, result);
    }

    @Test
    public void example3Test() {
        int num = 123;

        int result = numSteps.numberOfSteps(num);

        assertEquals(12, result);
    }

}