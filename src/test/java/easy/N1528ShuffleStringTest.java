package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N1528ShuffleStringTest {

    N1528ShuffleString shuffleString = new N1528ShuffleString();

    /*
        Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        Output: "leetcode"
        Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

     */
    @Test
    void restoreString1() {
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String actual = shuffleString.restoreString("codeleet", indices);
        String expected = "leetcode";
        assertEquals(expected, actual);
    }

    /*
        Input: s = "abc", indices = [0,1,2]
        Output: "abc"
        Explanation: After shuffling, each character remains in its position.
     */
    @Test
    void restoreString2() {
        int[] indices = {0, 1, 2};
        String actual = shuffleString.restoreString("abc", indices);
        String expected = "abc";
        assertEquals(expected, actual);
    }

    @Test
    void restoreString3() {
        int[] indices = {3, 1, 4, 2, 0};
        String actual = shuffleString.restoreString("aiohn", indices);
        String expected = "nihao";
        assertEquals(expected, actual);
    }

    @Test
    void restoreString4() {
        int[] indices = {4, 0, 2, 6, 7, 3, 1, 5};
        String actual = shuffleString.restoreString("aaiougrt", indices);
        String expected = "arigatou";
        assertEquals(expected, actual);
    }

    @Test
    void restoreString5() {
        int[] indices = {1, 0, 2};
        String actual = shuffleString.restoreString("art", indices);
        String expected = "rat";
        assertEquals(expected, actual);
    }
}