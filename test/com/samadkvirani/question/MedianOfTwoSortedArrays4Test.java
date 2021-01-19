package com.samadkvirani.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArrays4Test {

    MedianOfTwoSortedArrays4 median = new MedianOfTwoSortedArrays4();

    @Test
    public void emptyListsReturnsZeroTest() {
        int[] nums1 = {};
        int[] nums2 = {};

        double returned = median.attempt2(nums1, nums2);

        assertEquals(0.0, returned);
    }

    @Test
    public void example1Test() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        double returned = median.attempt2(nums1, nums2);

        assertEquals(2.0, returned);

    }

    @Test
    public void example2Test() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        double returned = median.attempt2(nums1, nums2);

        assertEquals(2.5, returned);
    }

    @Test
    public void example3Test() {
        int[] nums1 = {0,0};
        int[] nums2 = {0,0};

        double returned = median.attempt2(nums1, nums2);

        assertEquals(0.0, returned);
    }

    @Test
    public void example4Test() {
        int[] nums1 = {};
        int[] nums2 = {1};

        double returned = median.attempt2(nums1, nums2);

        assertEquals(1.0, returned);
    }

    @Test
    public void example5Test() {
        int[] nums1 = {2};
        int[] nums2 = {};

        double returned = median.attempt2(nums1, nums2);

        assertEquals(2.0, returned);
    }

    @Test
    public void spreadApartArrayTest() {
        int[] nums1 = {1,3};
        int[] nums2 = {2,7};

        double returned = median.attempt2(nums1, nums2);

        assertEquals(2.5, returned);
    }
}