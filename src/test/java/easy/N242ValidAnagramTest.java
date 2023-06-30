package easy;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class N242ValidAnagramTest {

    private static final N242ValidAnagram validAnagram = new N242ValidAnagram();

    /*  Example 1:
        Input: s = "anagram", t = "nagaram"
        Output: true    */
    @Test
    void isAnagram1() {
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        boolean actual = validAnagram.isAnagram(s, t);
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
        boolean actual = validAnagram.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Benchmark
    public boolean benchMark() {
        return validAnagram.isAnagram("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkSort() {
        return validAnagram.isAnagramSort("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkEnglishLetter() {
        return validAnagram.isAnagramEnglishLetter("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkMap() {
        return validAnagram.isAnagramMap("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkMapV2() {
        return validAnagram.isAnagramMapV2("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkMapMerge() {
        return validAnagram.isAnagramMapMerge("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }

    @Benchmark
    public boolean benchMarkStream() {
        return validAnagram.isAnagramStream("anagramqqqqqqqqqqtttwwwww", "nagaramqqqqqqqqqqtttwwwww");
    }
}