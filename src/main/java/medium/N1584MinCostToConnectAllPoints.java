package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class N1584MinCostToConnectAllPoints {
    /*
        1584. Min Cost to Connect All Points

        You are given an array points representing integer coordinates of some points on a 2D-plane,
        where points[i] = [xi, yi].

        The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them:
        |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.

        Return the minimum cost to make all points connected. All points are connected if there is exactly one
        simple path between any two points.

        Constraints:
            1 <= points.length <= 1000
            -106 <= xi, yi <= 106
            All pairs (xi, yi) are distinct.

        https://leetcode.com/problems/min-cost-to-connect-all-points/?envType=daily-question&envId=2023-09-15
     */

    /*
    В этом решении мы используем алгоритм Краскала для поиска минимальной стоимости соединения всех точек.
    Мы начинаем с создания массива родителей и массива рангов для каждой точки. Затем мы создаем список ребер,
    где каждое ребро представляет собой соединение между двумя точками и имеет стоимость, равную манхэттенскому
    расстоянию между ними. Мы сортируем список ребер по возрастанию стоимости.

    Затем мы проходим по каждому ребру в отсортированном списке. Для каждого ребра мы проверяем, принадлежат ли его
    две точки к одному компоненту связности. Если они принадлежат разным компонентам, мы объединяем их и увеличиваем
    минимальную стоимость на стоимость текущего ребра.

    Мы используем операцию поиска (find) и операцию объединения (union) для эффективного представления компонент
    связности с помощью массива родителей и массива рангов.

    Это решение имеет временную сложность O(n^2 log n), где n - количество точек в массиве.
     */
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[] parent = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int cost = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                edges.add(new Edge(i, j, cost));
            }
        }
        Collections.sort(edges, Comparator.comparingInt(a -> a.cost));
        int minCost = 0;
        for (Edge edge : edges) {
            int x = find(edge.src, parent);
            int y = find(edge.dest, parent);

            if (x != y) {
                minCost += edge.cost;
                union(x, y, parent, rank);
            }
        }
        return minCost;
    }

    private int find(int x, int[] parent) {
        if (x != parent[x]) {
            parent[x] = find(parent[x], parent);
        }
        return parent[x];
    }

    private void union(int x, int y, int[] parent, int[] rank) {
        if (rank[x] < rank[y]) {
            parent[x] = y;
        } else if (rank[x] > rank[y]) {
            parent[y] = x;
        } else {
            parent[y] = x;
            rank[x]++;
        }
    }

    class Edge {
        int src;
        int dest;
        int cost;

        public Edge(int src, int dest, int cost) {
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }
    }
}