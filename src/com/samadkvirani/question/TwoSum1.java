package com.samadkvirani.question;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example:
 * Input: nums = [2,7,11,15], target 9
 * Output: [0,1] - Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum1 {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length-1; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[i]+nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[] {-1,-1};
        }

        public int[] twoSumOnePass(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.containsKey(target- nums[i])) {
                    return new int[] {map.get(target-nums[i]), i};
                }
                map.put(nums[i], i);
            }
            return new int[] {-1, -1};
        }
}
