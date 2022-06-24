package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class N1354ConstructTargetArrayWithMultipleSumsTest {

    N1354ConstructTargetArrayWithMultipleSums constructTargetArrayWithMultipleSums = new N1354ConstructTargetArrayWithMultipleSums();

    /*
        Input: target = [9,3,5]
        Output: true
        Explanation: Start with arr = [1, 1, 1]
        [1, 1, 1], sum = 3 choose index 1
        [1, 3, 1], sum = 5 choose index 2
        [1, 3, 5], sum = 9 choose index 0
        [9, 3, 5] Done
     */
    @Test
    void isPossible1() {
        int[] target = {9, 3, 5};
        boolean actual = constructTargetArrayWithMultipleSums.isPossible(target);
        assertTrue(actual);
    }

    /*
        Input: target = [1,1,1,2]
        Output: false
        Explanation: Impossible to create target array from [1,1,1,1].
     */
    @Test
    void isPossible2() {
        int[] target = {1, 1, 1, 2};
        boolean actual = constructTargetArrayWithMultipleSums.isPossible(target);
        assertFalse(actual);
    }

    /*
        Input: target = [8,5]
        Output: true
     */
    @Test
    void isPossible3() {
        int[] target = {8, 5};
        boolean actual = constructTargetArrayWithMultipleSums.isPossible(target);
        assertTrue(actual);
    }
}