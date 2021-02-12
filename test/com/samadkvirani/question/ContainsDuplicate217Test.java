package com.samadkvirani.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicate217Test {

    public ContainsDuplicate217 duplicate = new ContainsDuplicate217();

    @Test
    public void oneDuplicateTest() {
        int[] nums = {1,2,3,1};

        boolean returned = duplicate.containsDuplicate(nums);

        assertEquals(true, returned);
    }

    @Test
    public void noDuplicateTest() {
        int[] nums = {1,2,3,4};

        boolean returned = duplicate.containsDuplicate(nums);

        assertEquals(false, returned);
    }

    @Test
    public void longDuplicateTest() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        boolean returned = duplicate.containsDuplicate(nums);

        assertEquals(true, returned);
    }

}