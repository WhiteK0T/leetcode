package medium;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class N49GroupAnagramsTest {

    public static final N49GroupAnagrams GROUP_ANAGRAMS = new N49GroupAnagrams();

    /*  Example 1:
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]     */
    @Test
    void groupAnagrams1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = List.of(
                List.of("bat"),
                List.of("tan", "nat"),
                List.of("eat", "tea", "ate"));
        List<List<String>> actual = GROUP_ANAGRAMS.groupAnagrams(strs);
        assertThat(actual, allOf(hasSize(3), containsInAnyOrder(expected.toArray())));
    }

    /*  Example 2:
        Input: strs = [""]
        Output: [[""]]       */
    @Test
    void groupAnagrams2() {
        String[] strs = {""};
        List<List<String>> expected = List.of(List.of(""));
        List<List<String>> actual = GROUP_ANAGRAMS.groupAnagrams(strs);
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    /*  Example 3:
        Input: strs = ["a"]
        Output: [["a"]]      */
    @Test
    void groupAnagrams3() {
        String[] strs = {"a"};
        List<List<String>> expected = List.of(List.of("a"));
        List<List<String>> actual = GROUP_ANAGRAMS.groupAnagrams(strs);
        assertThat(actual, containsInRelativeOrder(expected.toArray()));
    }

    /*  Example 4:
        Input: strs = ["ac","c"]
        Output: [["c"],["ac"]]     */
    @Test
    void groupAnagrams4() {
        String[] strs = {"ac", "c"};
        List<List<String>> expected = List.of(List.of("c"), List.of("ac"));
        List<List<String>> actual = GROUP_ANAGRAMS.groupAnagrams(strs);
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    /*  Example 5:
       Input: strs = ["ac","d"]
       Output: [["d"],["ac"]]    */
    @Test
    void groupAnagrams5() {
        String[] strs = {"ac", "d"};
        List<List<String>> expected = List.of(List.of("d"), List.of("ac"));
        List<List<String>> actual = GROUP_ANAGRAMS.groupAnagrams(strs);
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }
    /*  Example 6:
       Input: strs = ["hos","jew","nub","cod","old","way","fur","fla","cot","baa","leo","uzi","tho","pry","tun","hex",
       "fog","tad","eat","sow","cop","eke","jam","arc","guy","tow","aid","ann","bus","ten","ate","ewe","roy","leg",
       "gas","bug","jay","sup","phd"]

       Output: [["bug"],["leg"],["roy"],["ewe"],["ten"],["phd"],["tho"],["fla"],["cot"],["cop"],["fur"],["pry"],
       ["uzi"],["way"],["leo"],["hex"],["sow"],["guy"],["baa"],["jay"],["hos"],["nub"],["jew"],["gas"],["tun"],
       ["old"],["fog"],["sup"],["arc"],["tad"],["aid"],["ate","eat"],["eke"],["jam"],["tow"],["cod"],["bus"],["ann"]]
    */

    @Test
    void groupAnagrams6() {
        String[] strs = {"hos", "jew", "nub", "cod", "old", "way", "fur", "fla", "cot", "baa", "leo", "uzi", "tho", "pry", "tun", "hex",
                "fog", "tad", "eat", "sow", "cop", "eke", "jam", "arc", "guy", "tow", "aid", "ann", "bus", "ten", "ate", "ewe", "roy", "leg",
                "gas", "bug", "jay", "sup", "phd"};
        List<List<String>> expected = List.of(List.of("bug"), List.of("leg"), List.of("roy"), List.of("ewe"),
                List.of("ten"), List.of("phd"), List.of("tho"), List.of("fla"), List.of("cot"),
                List.of("cop"), List.of("fur"), List.of("pry"), List.of("uzi"), List.of("way"),
                List.of("leo"), List.of("hex"), List.of("sow"), List.of("guy"), List.of("baa"),
                List.of("jay"), List.of("hos"), List.of("nub"), List.of("jew"), List.of("gas"),
                List.of("tun"), List.of("old"), List.of("fog"), List.of("sup"), List.of("arc"),
                List.of("tad"), List.of("aid"), List.of("eat", "ate"), List.of("eke"), List.of("jam"),
                List.of("tow"), List.of("cod"), List.of("bus"), List.of("ann"));
        List<List<String>> actual = GROUP_ANAGRAMS.groupAnagrams(strs);
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }
    /*  Example 7:
       Input: strs = ["aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"]
       Output: [[aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa], [aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]]    */

    @Test
    void groupAnagrams7() {
        String[] strs = {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        List<List<String>> expected = List.of(List.of("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"), List.of("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        List<List<String>> actual = GROUP_ANAGRAMS.groupAnagrams(strs);
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

    @Benchmark
    public List<List<String>> groupAnagramsFirstBenchMark() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        return GROUP_ANAGRAMS.groupAnagramsFirst(strs);
    }

    @Benchmark
    public List<List<String>> groupAnagramsBigBenchMark() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        return GROUP_ANAGRAMS.groupAnagramsBigInteger(strs);
    }

    @Benchmark
    public List<List<String>> groupAnagramsStringBenchMark() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        return GROUP_ANAGRAMS.groupAnagramsString(strs);
    }

}