package com.arthurmrt.easy;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//20. Valid Parentheses
public class ValidParentheses {

    public boolean isValid2(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                char pop = stack.pop();

                if (pop == '(') {
                    if (ch != ')') return false;
                } else if (pop == '[') {
                    if (ch != ']') return false;
                } else if (pop == '{') {
                    if (ch != '}') return false;
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        int i = 0;

        while(i < s.length()){

            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
                i++;
                continue;
            }

            if(st.empty()) return false;
            char top;
            switch(s.charAt(i)){

                case ')':
                    top = st.pop();
                    if( top != '(') return false;
                    break;
                case ']':
                    top = st.pop();
                    if( top != '[') return false;
                    break;
                case '}':
                    top = st.pop();
                    if( top != '{') return false;
                    break;
            }
            i++;
        }

        if(st.empty() )
            return true;
        return false;


    }
}
