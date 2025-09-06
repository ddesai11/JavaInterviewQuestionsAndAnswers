package com.in28minutes.java.string;

public class BracesMatcher {

    public static void main(String[] args) {
        System.out.println(areBracesBalanced("()")); // true
        System.out.println(areBracesBalanced(")(")); // false
        System.out.println(areBracesBalanced("(())")); // true
        System.out.println(areBracesBalanced("(()())")); // true
        System.out.println(areBracesBalanced("((())")); // false
        System.out.println(areBracesBalanced("())(()")); // false
        System.out.println(areBracesBalanced("()()()")); // true
        System.out.println(areBracesBalanced("((()))()")); // true
        System.out.println(areBracesBalanced("((())())()")); // true
        System.out.println(areBracesBalanced("((())()))()")); // false
    }

    public static boolean areBracesBalanced(String braces) {
        int balance = 0;
        for (char c : braces.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) {
                    return false; // More closing braces than opening
                }
            }
        }
        return balance == 0; // True if balanced, false otherwise
    }

}
