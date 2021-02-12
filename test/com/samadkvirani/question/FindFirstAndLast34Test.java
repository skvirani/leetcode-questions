package com.samadkvirani.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindFirstAndLast34Test {

    FindFirstAndLast34 find = new FindFirstAndLast34();

    @Test
    public void targetFoundTest() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] result = find.searchRange(nums, target);

        assertArrayEquals(new int[] {3,4}, result);
    }

    @Test
    public void targetNotFoundTest() {
        int[] nums = {5,7,7,8,8,10};
        int target = 9;

        int[] result = find.searchRange(nums, target);

        assertArrayEquals(new int[] {-1,-1}, result);
    }

    @Test
    public void emptyListTest() {
        int[] nums = {};
        int target = 0;

        int[] result = find.searchRange(nums, target);

        assertArrayEquals(new int[] {-1,-1}, result);
    }

}