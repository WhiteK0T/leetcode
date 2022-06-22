package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class N20ValidParentheses {

    /*
        20. Valid Parentheses
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        An input string is valid if:
            1 Open brackets must be closed by the same type of brackets.
            2 Open brackets must be closed in the correct order.

        Constraints:
            1 <= s.length <= 104
            s consists of parentheses only '()[]{}'.

        https://leetcode.com/problems/valid-parentheses/
     */

    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(')', '(');
        brackets.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (brackets.containsKey(c)) {
                char top = stack.isEmpty() ? 'x' : stack.pop();
                if (top != brackets.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }
}
