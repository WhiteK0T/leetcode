package hard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class N332ReconstructItineraryTest {

    private final static N332ReconstructItinerary RECONSTRUCT_ITINERARY = new N332ReconstructItinerary();

    /*  Example 1:
        Input: tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
        Output: ["JFK","MUC","LHR","SFO","SJC"]   */
    @Test
    void findItinerary1() {
        List<List<String>> input = List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"),
                List.of("LHR", "SFO"));
        List<String> expected = List.of("JFK", "MUC", "LHR", "SFO", "SJC");
        List<String> actual = RECONSTRUCT_ITINERARY.findItinerary(input);
        assertThat(actual, equalTo(expected));
    }

    /*  Example 2:
        Input: tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
        Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
        Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"] but it is larger in
        lexical order.   */
    @Test
    void findItinerary2() {
        List<List<String>> input = List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"),
                List.of("ATL", "JFK"), List.of("ATL", "SFO"));
        List<String> expected = List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
        List<String> actual = RECONSTRUCT_ITINERARY.findItinerary(input);
        assertThat(actual, equalTo(expected));
    }
}