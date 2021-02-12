package com.samadkvirani.question;

public class FindFirstAndLast34 {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        return new int[] {left, right};
    }

    public int binarySearch(int[] nums, int target, boolean leftBias) {
        int left = 0, right = nums.length - 1, i = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                i = mid;
                if (leftBias) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return i;
    }



}
