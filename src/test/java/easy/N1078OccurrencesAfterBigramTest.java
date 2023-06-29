package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N1078OccurrencesAfterBigramTest {

    private final N1078OccurrencesAfterBigram occurrencesAfterBigram = new N1078OccurrencesAfterBigram();

    /*
        Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
        Output: ["girl","student"]
     */
    @Test
    void findOcurrences1() {
        String text = "alice is a good girl she is a good student";
        String[] actual = occurrencesAfterBigram.findOcurrences(text, "a", "good");
        String[] expected = {"girl", "student"};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findOcurrences2() {
        String text = "we will we will rock you";
        String[] actual = occurrencesAfterBigram.findOcurrences(text, "we", "will");
        String[] expected = {"we", "rock"};
        assertArrayEquals(expected, actual);
    }
}