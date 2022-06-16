package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N500KeyboardRow {
    /*
    Keyboard Row. Leetcode.
    Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

    In the American keyboard:
       1 the first row consists of the characters "qwertyuiop",
       2 the second row consists of the characters "asdfghjkl", and
       3 the third row consists of the characters "zxcvbnm".
    https://leetcode.com/problems/keyboard-row/
    */
    public String[] findWords(String[] words) {
        char[] s1 = "qwertyuiop".toCharArray();
        char[] s2 = "asdfghjkl".toCharArray();
        char[] s3 = "zxcvbnm".toCharArray();
        Map<Character, Integer> map = new HashMap<>(); // <char, row number>

        for (char s : s1) {
            map.put(s, 1);
        }
        for (char s : s2) {
            map.put(s, 2);
        }
        for (char s : s3) {
            map.put(s, 3);
        }
        List<String> list = new ArrayList<>(words.length);

        for (String word : words) {
            char[] arr = word.toCharArray();
            int row = map.get(Character.toLowerCase(arr[0]));
            boolean isGood = true;
            for (char c : arr) {
                if (row != map.get(Character.toLowerCase(c))) {
                    isGood = false;
                    break;
                }
            }
            if (isGood)
                list.add(word);
        }
        return list.toArray(new String[0]);
    }
}
