package easy;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class N242ValidAnagramTest {

    private static final N242ValidAnagram VALID_ANAGRAM = new N242ValidAnagram();

    /*  Example 1:
        Input: s = "anagram", t = "nagaram"
        Output: true    */
    @Test
    void isAnagram1() {
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        boolean actual = VALID_ANAGRAM.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    /*  Example 2:
        Input: s = "rat", t = "car"
        Output: false   */
    @Test
    void isAnagram() {
        String s = "rat";
        String t = "car";
        boolean expected = false;
        boolean actual = VALID_ANAGRAM.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Benchmark
    public boolean benchMark() {
        return VALID_ANAGRAM.isAnagram("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkSort() {
        return VALID_ANAGRAM.isAnagramSort("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkEnglishLetter() {
        return VALID_ANAGRAM.isAnagramEnglishLetter("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkMap() {
        return VALID_ANAGRAM.isAnagramMap("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkMapV2() {
        return VALID_ANAGRAM.isAnagramMapV2("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkMapMerge() {
        return VALID_ANAGRAM.isAnagramMapMerge("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkStream() {
        return VALID_ANAGRAM.isAnagramStream("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }
}