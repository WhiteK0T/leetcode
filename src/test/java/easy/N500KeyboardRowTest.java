package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N500KeyboardRowTest {
    private final N500KeyboardRow keyboardRow = new N500KeyboardRow();

    /*
        Input: words = ["Hello","Alaska","Dad","Peace"]
        Output: ["Alaska","Dad"]
     */
    @Test
    void findWords1() {
        String[] actual = keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        String[] expected = {"Alaska", "Dad"};
        assertArrayEquals(expected, actual);
    }

    /*
        Input: words = ["omk"]
        Output: []
     */
    @Test
    void findWords2() {
        String[] actual = keyboardRow.findWords(new String[]{"omk"});
        String[] expected = {};
        assertArrayEquals(expected, actual);
    }

    /*
        Input: words = ["adsdf","sfd"]
        Output: ["adsdf","sfd"]
     */
    @Test
    void findWords3() {
        String[] actual = keyboardRow.findWords(new String[]{"adsdf", "sfd"});
        String[] expected = {"adsdf", "sfd"};
        assertArrayEquals(expected, actual);
    }
}