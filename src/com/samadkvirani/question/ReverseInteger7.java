package com.samadkvirani.question;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 */

public class ReverseInteger7 {
    public int reverse(int x) {
        boolean isNeg = false;
        if (x < 0) {
            isNeg = true;
        }
        try {
            StringBuilder s = new StringBuilder(String.valueOf(Math.abs(x))).reverse();
            return isNeg ? Integer.parseInt(s.toString())* -1 : Integer.parseInt(s.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

    }

}
