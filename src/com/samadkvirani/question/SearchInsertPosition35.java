package com.samadkvirani.question;

/**
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the
 * index where it would be if it were inserted in order.
 */
public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (target > nums[length-1]) {
            return length;
        } else {
            for (int i = 0; i < length; i++) {
                if (target <= nums[i]) {
                    return i;
                }
            }
            return 0;
        }
    }
}
