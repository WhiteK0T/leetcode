package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class N20ValidParenthesesTest {

    N20ValidParentheses validParentheses = new N20ValidParentheses();

    /*
        Input: s = "()"
        Output: true
     */
    @Test
    void isValid1() {
        String s = "()";
        boolean condition = validParentheses.isValid(s);
        assertTrue(condition);
    }

    /*
        Input: s = "()[]{}"
        Output: true
    */
    @Test
    void isValid2() {
        String s = "()[]{}";
        boolean condition = validParentheses.isValid(s);
        assertTrue(condition);
    }

    /*
        Input: s = "(]"
        Output: false
    */
    @Test
    void isValid3() {
        String s = "(]";
        boolean condition = validParentheses.isValid(s);
        assertFalse(condition);
    }

    /*
        Input: s = "([)]"
        Output: false
    */
    @Test
    void isValid4() {
        String s = "([)]";
        boolean condition = validParentheses.isValid(s);
        assertFalse(condition);
    }

    /*
        Input: s = "{[]}"
        Output: true
    */
    @Test
    void isValid5() {
        String s = "{[]}";
        boolean condition = validParentheses.isValid(s);
        assertTrue(condition);
    }
}