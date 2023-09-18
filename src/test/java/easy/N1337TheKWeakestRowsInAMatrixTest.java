package easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class N1337TheKWeakestRowsInAMatrixTest {

    private static final N1337TheKWeakestRowsInAMatrix THE_K_WEAKEST_ROWS_IN_A_MATRIX = new N1337TheKWeakestRowsInAMatrix();

    /*  Example 1:
        Input: mat =
        [[1,1,0,0,0],
        [1,1,1,1,0],
        [1,0,0,0,0],
        [1,1,0,0,0],
        [1,1,1,1,1]],
        k = 3
        Output: [2,0,3]
        Explanation:
        The number of soldiers in each row is:
            - Row 0: 2
            - Row 1: 4
            - Row 2: 1
            - Row 3: 2
            - Row 4: 5
        The rows ordered from weakest to strongest are [2,0,3,1,4]. */
    @Test
    void kWeakestRows1() {
        int[][] input = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;
        int[] expected = new int[]{2, 0, 3};
        int[] actual = THE_K_WEAKEST_ROWS_IN_A_MATRIX.kWeakestRows(input, k);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
        Input: mat =
        [[1,0,0,0],
        [1,1,1,1],
        [1,0,0,0],
        [1,0,0,0]],
        k = 2
        Output: [0,2]
        Explanation:
        The number of soldiers in each row is:
            - Row 0: 1
            - Row 1: 4
            - Row 2: 1
            - Row 3: 1
        The rows ordered from weakest to strongest are [0,2,3,1]. */
    @Test
    void kWeakestRows2() {
        int[][] input = new int[][]{{1, 0, 0, 0, 0}, {1, 1, 1, 1, 1}, {1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}};
        int k = 2;
        int[] expected = new int[]{0, 2};
        int[] actual = THE_K_WEAKEST_ROWS_IN_A_MATRIX.kWeakestRows(input, k);
        assertThat(actual, equalTo(expected));
    }
}