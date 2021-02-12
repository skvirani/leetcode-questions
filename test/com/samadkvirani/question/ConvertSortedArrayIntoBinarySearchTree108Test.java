package com.samadkvirani.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertSortedArrayIntoBinarySearchTree108Test {

    ConvertSortedArrayIntoBinarySearchTree108 convert = new ConvertSortedArrayIntoBinarySearchTree108();

    @Test
    public void example1Test() {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode treeNode = new TreeNode(0, new TreeNode(-3, new TreeNode(-10), null), new TreeNode(9, new TreeNode(5), null));

        TreeNode returned = convert.sortedArrayToBST(nums);

        assertEquals(treeNode.getClass(), returned.getClass());

    }

}