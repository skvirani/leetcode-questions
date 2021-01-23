package com.samadkvirani.question;

import java.util.HashMap;

public class ContainsDuplicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer old = map.put(nums[i], i);
            if (old != null && Math.abs(old-i) <= k) {
                return true;
            }
        }
        return false;
    }
}
