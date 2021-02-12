package com.samadkvirani.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateIII220Test {

    public ContainsDuplicateIII220 duplicate = new ContainsDuplicateIII220();

    @Test
    public void oneDuplicateTest() {
        int[] nums = {1,2,3,1};

        boolean returned = duplicate.containsNearbyAlmostDuplicate(nums, 3, 0);

        assertEquals(true, returned);
    }

    @Test
    public void noDuplicateTest() {
        int[] nums = {1,0,1,1};

        boolean returned = duplicate.containsNearbyAlmostDuplicate(nums, 1, 2);

        assertEquals(true, returned);
    }

    @Test
    public void longDuplicateTest() {
        int[] nums = {1,5,9,1,5,9};

        boolean returned = duplicate.containsNearbyAlmostDuplicate(nums, 2, 3);

        assertEquals(false, returned);
    }
    @Test
    public void leetcodeTest() {
        int[] nums = {8,7,15,1,6,1,9,15};

        boolean returned = duplicate.containsNearbyAlmostDuplicate(nums, 1, 3);

        assertEquals(true, returned);
    }

    @Test
    public void bigNumberTest() {
        int[] nums = {2147483640,2147483641};

        boolean returned = duplicate.containsNearbyAlmostDuplicate(nums, 1, 100);

        assertEquals(true, returned);
    }

    @Test
    public void smallNumberTest() {
        int[] nums = {-2147483640,-2147483641};

        boolean returned = duplicate.containsNearbyAlmostDuplicate(nums, 1, 100);

        assertEquals(true, returned);
    }

    @Test
    public void SMALLbigNumberTest() {
        int[] nums = {2147483647,-1,2147483647};

        boolean returned = duplicate.containsNearbyAlmostDuplicate(nums, 1, 2147483647);

        assertEquals(false, returned);
    }


}