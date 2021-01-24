package com.samadkvirani.question;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>(3);
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //check if the element is a closing parenthesis
            if (map.containsKey(c)) {
                //assign to an incorrect value if nothing exists so that it will fail on purpose
                //otherwise assign to the actual value
                char pop = stack.empty() ? '#' : stack.pop();
                //if pop is the same as the corresponding opening bracket, do nothing
                //if pop is not the same, it is an incorrect parenthesis
                if (pop != map.get(c)) {
                    return false;
                }
            } else {
                //if element is not a closing parenthesis, push to stack
                stack.push(c);
            }
        }
        //returns true if stack is empty. False otherwise.
        //this means that the stack has no more pairs of parenthesis
        return stack.empty();
    }
}
