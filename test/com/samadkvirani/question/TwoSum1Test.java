package com.samadkvirani.question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSum1Test {

    TwoSum1 twoSum = new TwoSum1();

    @Test
    public void twoSumLastDigitsTest() {
        int[] nums = {3,2,4};
        int[] returned = twoSum.twoSum(nums, 6);

        Assertions.assertEquals(Arrays.toString(new int[]{1,2}), Arrays.toString(returned));
    }

    @Test
    public void twoSumFirstDigitsTest() {
        int[] nums = {2,7,11,15};
        int[] returned = twoSum.twoSum(nums, 9);

        Assertions.assertEquals(Arrays.toString(new int[]{0,1}), Arrays.toString(returned));
    }

    @Test
    public void twoSumNoSolutionTest() {
        int[] nums = {1,2,3,4,5};
        int[] returned = twoSum.twoSum(nums, 10);

        Assertions.assertEquals(Arrays.toString(new int[]{-1,-1}), Arrays.toString(returned));
    }

}