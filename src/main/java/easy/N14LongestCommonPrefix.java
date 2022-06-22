package easy;

public class N14LongestCommonPrefix {

    /*
        14. Longest Common Prefix
        Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".

        Constraints:
            1 <= strs.length <= 200
            0 <= strs[i].length <= 200
            strs[i] consists of only lowercase English letters.

        https://leetcode.com/problems/longest-common-prefix/
     */

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (String str : strs) {
            while (str.indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        }
        return result;
    }
}
