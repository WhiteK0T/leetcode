package hard;

import java.util.*;

public class N332ReconstructItinerary {
    /*
        332. Reconstruct Itinerary
        You are given a list of airline tickets where tickets[i] = [fromi, toi] represent the departure and the arrival
        airports of one flight. Reconstruct the itinerary in order and return it.

        All of the tickets belong to a man who departs from "JFK", thus, the itinerary must begin with "JFK".
        If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical
        order when read as a single string.

        For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].

        You may assume all tickets form at least one valid itinerary. You must use all the tickets once and only once.

        Constraints:
            1 <= tickets.length <= 300
            tickets[i].length == 2
            fromi.length == 3
            toi.length == 3
            fromi and toi consist of uppercase English letters.
            fromi != toi

        https://leetcode.com/problems/reconstruct-itinerary/?envType=daily-question&envId=2023-09-14
     */

    public List<String> findItinerary(List<List<String>> tickets) {
        // Создаем граф перелетов
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        // Заполняем граф
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.computeIfAbsent(from, s -> new PriorityQueue<>())
                    .offer(to);
        }
        List<String> itinerary = new ArrayList<>();
        dfs("JFK", graph, itinerary);
        Collections.reverse(itinerary);
        return itinerary;
    }

    private void dfs(String airport, Map<String, PriorityQueue<String>> graph, List<String> itinerary) {
        PriorityQueue<String> arrivals = graph.get(airport);
        while (arrivals != null && !arrivals.isEmpty()) {
            dfs(arrivals.poll(), graph, itinerary);
        }
        itinerary.add(airport);
    }
}