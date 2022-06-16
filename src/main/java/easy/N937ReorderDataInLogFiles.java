package easy;

import java.util.Arrays;

public class N937ReorderDataInLogFiles {
    /*
    937. Reorder Data in Log Files

    You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.
    There are two types of logs:
        Letter-logs: All words (except the identifier) consist of lowercase English letters.
        Digit-logs: All words (except the identifier) consist of digits.

        Reorder these logs so that:
            The letter-logs come before all digit-logs.
            The letter-logs are sorted lexicographically by their contents. If their contents are the same, then sort them lexicographically by their identifiers.
            The digit-logs maintain their relative ordering.

    Return the final order of the logs.

    https://leetcode.com/problems/reorder-data-in-log-files/
    */
    public String[] ReorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            boolean isLog1Letter = Character.isLetter(log1.charAt(log1.length() - 1));
            boolean isLog2Letter = Character.isLetter(log2.charAt(log2.length() - 1));
            if (isLog1Letter && !isLog2Letter) return -1;
            if (!isLog1Letter && isLog2Letter) return 1;
            if (isLog1Letter) {
                int id1Length = log1.indexOf(' ');
                int id2Length = log2.indexOf(' ');
                String content1 = log1.substring(id1Length + 1);
                String content2 = log2.substring(id2Length + 1);
                if (content1.equals(content2)) {
                    String id1 = log1.substring(0, id1Length);
                    String id2 = log2.substring(0, id2Length);
                    return id1.compareTo(id2);
                }
                return content1.compareTo(content2);
            }
            return 0;
        });
        return logs;
    }
}
