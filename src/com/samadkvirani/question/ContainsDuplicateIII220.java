package com.samadkvirani.question;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Given an array of integers, find out whether there are two distinct indices i and j
 * in the array such that the absolute difference between nums[i] and nums[j] is at most
 * t and the absolute difference between i and j is at most k.
 */
public class ContainsDuplicateIII220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int jMin = Math.max(i - k, 0);
            int jMax = Math.min(i + k, nums.length);
            for (int j = jMin; j < jMax; j++) {
                if (i != j && Math.abs((long)nums[j]-(long)nums[i]) <= t) {
                    return true;
                }

            }
            map.put(nums[i], i);
        }
        return false;
    }
}
