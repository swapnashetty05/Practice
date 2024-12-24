package com.test.leetcode.easy;

import java.util.Stack;

public class ValidateParentheses {

	/**
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order. Every close bracket has a corresponding open
	 * bracket of the same type.
	 * 
	 **/

	public static void main(String[] args) {

		String input = "({}[])";
		Boolean valid = false;
		valid = isValid(input);

		/*
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {

			case '(' -> {
				if (input.contains(")")) {
					valid = true;
				} else {
					valid = false;
					break;
				}
				;
			}
			case '[' -> {
				if (input.contains("]")) {
					valid = true;
				}
			}
			case '{' -> {
				if (input.contains("}")) {
					valid = true;
				}
			}
			case ')' -> {
				if (input.contains("(")) {
					valid = true;
				}
			}
			case ']' -> {
				if (input.contains("[")) {
					valid = true;
				}
			}
			case '}' -> {
				if (input.contains("{")) {
					valid = true;
				}
			}
			default -> valid = false;

			}
		}
		*/
		System.out.println(valid);

	}

	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
        	//check if char is opening bracket
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
            	//if its a closing bracket, check if stack is not empty
            	//and if the top pf the stack is a matching opening bracket
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (c == ')' && open != '(') return false;
                if (c == '}' && open != '{') return false;
                if (c == ']' && open != '[') return false;
            }
        }
        return stack.isEmpty();
    }
	
}
