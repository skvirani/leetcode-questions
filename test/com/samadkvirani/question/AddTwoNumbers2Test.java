package com.samadkvirani.question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbers2Test {

    AddTwoNumbers2 addTwoNumbers2 = new AddTwoNumbers2();

    @Test
    public void sameSizeWithOneCarryTest() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Assertions.assertEquals("[7,0,8]", addTwoNumbers2.toString(addTwoNumbers2.addTwoNumbers(l1,l2)));
    }

    @Test
    public void differentSizeListTest() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        Assertions.assertEquals("[8,9,9,9,0,0,0,1]", addTwoNumbers2.toString(addTwoNumbers2.addTwoNumbers(l1,l2)));
    }

    @Test
    public void createListNode() {
        ListNode l = new ListNode();

        Assertions.assertTrue(l instanceof ListNode);
    }






}