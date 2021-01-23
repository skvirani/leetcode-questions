package com.samadkvirani.question;

import java.util.HashSet;

public class ContainsDuplicate217 {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>(nums.length);
        for (int num : nums) {
            if(!set.add(num))
                return true;
        }

        return false;

    }
}
