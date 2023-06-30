package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class N242ValidAnagram {
    /*
        242. Valid Anagram

        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
        all the original letters exactly once.

        Constraints:
            1 <= s.length, t.length <= 5 * 104
            s and t consist of lowercase English letters.

        Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

        https://leetcode.com/problems/valid-anagram/
     */

    public boolean isAnagram(String s, String t) {
        return isAnagramMapV2(s, t);
    }

    public boolean isAnagramStream(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Long> sStringCounterMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<Character, Long> tStringCounterMap = t.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return sStringCounterMap.equals(tStringCounterMap);
    }

    public boolean isAnagramMapMerge(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCounterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            //charCounterMap.merge(sc, 1, Integer::sum);
            charCounterMap.compute(sc, (k, v) -> v == null ? 1 : ++v);
            char tc = t.charAt(i);
            //charCounterMap.merge(tc, -1, Integer::sum);
            charCounterMap.compute(tc, (k, v) -> v == null ? -1 : --v);
        }
        for (Integer value : charCounterMap.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCounterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            int charCounterS = charCounterMap.getOrDefault(sChar, 0);
            charCounterMap.put(sChar, ++charCounterS);
            char tChar = t.charAt(i);
            int charCounterT = charCounterMap.getOrDefault(tChar, 0);
            charCounterMap.put(tChar, --charCounterT);
        }
        for (Integer value : charCounterMap.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramMapV2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCounterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charCounterMap.compute(s.charAt(i), (key, value) -> value == null ? 1 : ++value);
        }
        for (int i = 0; i < s.length(); i++) {
            char tChar = t.charAt(i);
            int count = charCounterMap.getOrDefault(tChar, 0);
            if (count == 0) {
                return false;
            }
            charCounterMap.put(tChar, --count);
        }
        return true;
    }

    public boolean isAnagramEnglishLetter(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCounter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounter[s.charAt(i) - 'a']++;
            charCounter[t.charAt(i) - 'a']--;
        }

        for (int counter : charCounter) {
            if (counter != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramSort(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);
        return Arrays.equals(sCharArr, tCharArr);
    }
}