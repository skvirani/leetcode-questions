package com.samadkvirani.question;

import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 * Input: linkedlist1 = [{2} -> {4}* -> {3}*] linkedlist2 = [{5} -> {6}* -> {4}*]
 * Output: [{7} -> {0} -> {8}]
 * Explanation: 342 + 465 = 807
 *
 * answer = [{7} -> {0} -> {8}* -> {0}]
 * answer = [{0} - > {8}]
 * holder = [{0} - > {8}]
 *
 */
public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode holder = answer;
        int carry = 0, sum, hold1, hold2;
        while (l1 != null || l2 != null) {
            hold1 = l1 == null ? 0 : l1.val;
            hold2 = l2 == null ? 0 : l2.val;
            sum = carry + hold1 + hold2;
            carry = sum > 9 ? 1 : 0;
            answer.next = new ListNode(sum % 10);
            answer = answer.next;
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if(carry > 0) {
            answer.next = new ListNode(carry);
        }
        return holder.next;
    }

    public String toString(ListNode l) {
        StringBuilder stringBuilder = new StringBuilder("[");
        while (l != null) {
            stringBuilder.append(l.val);
            l = l.next;
            if (l != null) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}

