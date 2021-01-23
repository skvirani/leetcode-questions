package com.samadkvirani.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateII219Test {

    public ContainsDuplicateII219 duplicate = new ContainsDuplicateII219();

    @Test
    public void oneDuplicateTest() {
        int[] nums = {1,2,3,1};

        boolean returned = duplicate.containsNearbyDuplicate(nums, 3);

        assertEquals(true, returned);
    }

    @Test
    public void noDuplicateTest() {
        int[] nums = {1,0,1,1};

        boolean returned = duplicate.containsNearbyDuplicate(nums, 1);

        assertEquals(true, returned);
    }

    @Test
    public void longDuplicateTest() {
        int[] nums = {1,2,3,1,2,3};

        boolean returned = duplicate.containsNearbyDuplicate(nums, 2);

        assertEquals(false, returned);
    }

}