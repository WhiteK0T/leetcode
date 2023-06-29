package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N937ReorderDataInLogFilesTest {

    private final N937ReorderDataInLogFiles reorderDataInLogFiles = new N937ReorderDataInLogFiles();

    /*
        Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
        Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
        Explanation:
        The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
        The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".
     */
    @Test
    void reorderLogFiles() {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] actual = reorderDataInLogFiles.ReorderLogFiles(logs);
        String[] expected = {"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};
        assertArrayEquals(expected, actual);
    }

    /*
        Input: logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
        Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
     */
    @Test
    void reorderLogFiles1() {
        String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        String[] actual = reorderDataInLogFiles.ReorderLogFiles(logs);
        String[] expected = {"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
        assertArrayEquals(expected, actual);
    }
}
