package easy;

import java.util.Arrays;

public class N1337TheKWeakestRowsInAMatrix {
    /*
        1337. The K Weakest Rows in a Matrix

        You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
        The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all
        the 0's in each row.

        A row i is weaker than a row j if one of the following is true:

        The number of soldiers in row i is less than the number of soldiers in row j.
        Both rows have the same number of soldiers and i < j.

        Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

        Constraints:
            m == mat.length
            n == mat[i].length
            2 <= n, m <= 100
            1 <= k <= m
            matrix[i][j] is either 0 or 1.

        https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/?envType=daily-question&envId=2023-09-18
     */

    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rows = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int countSoldiers = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    countSoldiers++;
                } else {
                    break;
                }
            }
            rows[i] = new int[]{i, countSoldiers};
        }
        // Sort the rows based on the number of soldiers
        Arrays.sort(rows, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });
        // Create an array to store the indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rows[i][0];
        }
        return result;
    }
}