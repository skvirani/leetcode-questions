package com.samadkvirani.question;

import com.sun.source.tree.BinaryTree;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of
 * every node never differ by more than 1.
 */
public class ConvertSortedArrayIntoBinarySearchTree108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);

    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(nums, left, mid - 1);
            root.right = helper(nums, mid + 1, right);
            return root;
        }
        return null;
    }
}
