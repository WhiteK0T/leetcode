package easy;

public class N1528ShuffleString {
    /*
        1528. Shuffle String
        You are given a string s and an integer array indices of the same length. The string s will be shuffled such that
        the character at the ith position moves to indices[i] in the shuffled string.
        Return the shuffled string.
        https://leetcode.com/problems/shuffle-string/
    */

    public String restoreString(String s, int[] indices) {
        StringBuilder res = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            res.setCharAt(indices[i], s.charAt(i));
        }
        return res.toString();
    }
}
