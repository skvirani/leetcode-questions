package com.samadkvirani.question;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class SearchInsertPosition35Test {

    SearchInsertPosition35 search = new SearchInsertPosition35();

    @Test
    public void example1Test() {
        int[] nums = {1,3,5,6};

        int returned = search.searchInsert(nums, 5);

        Assertions.assertEquals(2, returned);

    }
    @Test
    public void example2Test() {
        int[] nums = {1,3,5,6};

        int returned = search.searchInsert(nums, 2);

        Assertions.assertEquals(1, returned);

    }
    @Test
    public void example3Test() {
        int[] nums = {1,3,5,6};

        int returned = search.searchInsert(nums, 7);

        Assertions.assertEquals(4, returned);

    }
    @Test
    public void example4Test() {
        int[] nums = {1,3,5,6};

        int returned = search.searchInsert(nums, 0);

        Assertions.assertEquals(0, returned);

    }
    @Test
    public void example5Test() {
        int[] nums = {1};

        int returned = search.searchInsert(nums, 0);

        Assertions.assertEquals(0, returned);

    }

}