package hard;

import java.util.LinkedList;
import java.util.Queue;

public class N847ShortestPathVisitingAllNodes {
    /*
        847. Shortest Path Visiting All Nodes

        You have an undirected, connected graph of n nodes labeled from 0 to n - 1. You are given an array graph where
        graph[i] is a list of all the nodes connected with node i by an edge.

        Return the length of the shortest path that visits every node. You may start and stop at any node, you may
        revisit nodes multiple times, and you may reuse edges.

        Constraints:
            n == graph.length
            1 <= n <= 12
            0 <= graph[i].length < n
            graph[i] does not contain i.
            If graph[a] contains b, then graph[b] contains a.
            The input graph is always connected.

        https://leetcode.com/problems/shortest-path-visiting-all-nodes/?envType=daily-question&envId=2023-09-17
     */

    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        if (n == 0) return 0;
        int goal = (1 << n) - 1; // битовая маска, представляющая все посещенные узлы
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] status = new boolean[n][1 << n];
        for (int i = 0; i < n; i++) {
            status[i][1 << i] = true;
            queue.offer(new int[]{i, 1 << i, 0});
        }
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int curNode = node[0];
            int bitmask = node[1];
            int dist = node[2];
            if (bitmask == goal) {
                return dist;
            }
            for (int to : graph[curNode]) {
                int tempMask = bitmask | (1 << to);
                if (!status[to][tempMask]) {
                    queue.offer(new int[]{to, tempMask, dist + 1});
                    status[to][tempMask] = true;
                }
            }
        }
        return 0;
    }
}
