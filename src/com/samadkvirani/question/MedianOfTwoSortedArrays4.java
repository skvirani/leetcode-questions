package com.samadkvirani.question;

import java.util.ArrayList;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * Follow up: The overall run time complexity should be O(log (m+n)).
 */
public class MedianOfTwoSortedArrays4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> holder = new ArrayList<Integer>();
        int biggerSize = nums1.length < nums2.length ? nums2.length : nums1.length;
        boolean nums1IsBigger;
        if (nums1.length <= nums2.length) {
            biggerSize = nums2.length;
            nums1IsBigger = false;
        } else if (nums1.length > nums2.length) {
            biggerSize = nums1.length;
            nums1IsBigger = true;
        }

        for (int i = 0; i < biggerSize; i++) {
            try {
                holder.add(nums1[i] <= nums2[i] ? nums2[i] : nums1[i]);
            } catch (IndexOutOfBoundsException e) {

            }
        }
//        holder.

        return 0.0;
    }

    public double attempt2(int[] nums1, int[] nums2) {
        double median1 = 0.0, median2 = 0.0, median = 0.0;
        if (nums1.length != 0) {
            if (nums1.length % 2 == 0) {
                int low = (int) Math.floor((double) (nums1.length - 1)/2);
                int high = (int) Math.ceil((double) (nums1.length - 1)/2);
                median1 = ((double)nums1[low] + (double) nums1[high]) / 2;
            } else {
                median1 = nums1[nums1.length/2];
            }
        }
        if (nums2.length != 0){
            if (nums2.length % 2 == 0) {
                int low = (int) Math.floor((double) (nums2.length - 1)/2);
                int high = (int) Math.ceil((double) (nums2.length - 1)/2);
                median2 = ((double) nums2[low] + (double) nums2[high]) / 2;
            } else {
                median2 = nums2[nums2.length/2];
            }
        }


        if (median1 == 0 && median2 != 0) {
            median = median2;
        } else if (median2 == 0 && median1 != 0) {
            median = median1;
        } else if (median1 != median2) {
            median = (median1 + median2) / 2.0;
        } else {
            median = median1;
        }



        return median;
    }

    public double attempt3(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums3 = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length || j < nums2.length) {
            if (i >= nums1.length) {
                nums3.add(nums2[j]);
                j++;
            } else if (j >= nums2.length) {
                nums3.add(nums1[i]);
                i++;
            } else if (nums1[i] < nums2[j]) {
                nums3.add(nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                nums3.add(nums2[j]);
                j++;
            } else if (nums1[i] == nums2[j]) {
                nums3.add(nums1[i]);
                nums3.add(nums2[j]);
                i++;
                j++;
            }
        }

        if (nums3.size() != 0) {
            double median;
            if (nums3.size() % 2 == 0) {
                int low = (int) Math.floor((double) (nums3.size() - 1)/2);
                int high = (int) Math.ceil((double) (nums3.size() - 1)/2);
                median = ((double)nums3.get(low) + (double) nums3.get(high)) / 2;
            } else {
                median = nums3.get(nums3.size() / 2);
            }
            return median;
        } else {
            return 0.0;
        }
    }
}
