package com.samadkvirani;

import com.samadkvirani.question.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AddTwoNumbers2 addTwoNumbers2 = new AddTwoNumbers2();

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode l3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));


        addTwoNumbers2.addTwoNumbers(l3,l4);


    }

}
