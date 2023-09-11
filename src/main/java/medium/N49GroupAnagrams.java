package medium;

import java.math.BigInteger;
import java.util.*;

public class N49GroupAnagrams {
    /*
        49. Group Anagrams

        Given an array of strings strs, group the anagrams together. You can return the answer in any order.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
        typically using all the original letters exactly once.

        Constraints:
            1 <= strs.length <= 104
            0 <= strs[i].length <= 100
            strs[i] consists of lowercase English letters.

        https://leetcode.com/problems/group-anagrams/
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        return groupAnagramsString(strs);
    }

    public List<List<String>> groupAnagramsFirst(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> keyAnagramGroupMap = new HashMap<>();
        for (String str : strs) {
            char[] key = str.toCharArray();
            Arrays.sort(key);
            keyAnagramGroupMap.computeIfAbsent(new String(key), s -> new ArrayList<>())
                    .add(str);
        }
        return new ArrayList<>(keyAnagramGroupMap.values());
    }

    public List<List<String>> groupAnagramsBigInteger(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<BigInteger, List<String>> keyAnagramGroupMap = new HashMap<>();
        for (String str : strs) {
            BigInteger key = new BigInteger(String.valueOf(0));
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - 96;
                while (key.testBit(c)) {
                    c += 26;
                }
                key = key.setBit(c);
            }
            keyAnagramGroupMap.computeIfAbsent(key, s -> new ArrayList<>())
                    .add(str);
        }
        return new ArrayList<>(keyAnagramGroupMap.values());
    }

    public List<List<String>> groupAnagramsString(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> keyAnagramGroupMap = new HashMap<>();
        for (String str : strs) {
            char[] hash = new char[26];
            for (int i = 0; i < str.length(); i++) {
                hash[str.charAt(i) - 97]++;
            }
            keyAnagramGroupMap.computeIfAbsent(new String(hash), s -> new ArrayList<>())
                    .add(str);
        }
        return new ArrayList<>(keyAnagramGroupMap.values());
    }
}