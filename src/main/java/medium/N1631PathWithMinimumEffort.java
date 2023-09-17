package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class N1631PathWithMinimumEffort {
    /*
        1631. Path With Minimum Effort

        You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns,
        where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0),
         and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down,
         left, or right, and you wish to find a route that requires the minimum effort.

        A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.

        Return the minimum effort required to travel from the top-left cell to the bottom-right cell.

        Constraints:
            rows == heights.length
            columns == heights[i].length
            1 <= rows, columns <= 100
            1 <= heights[i][j] <= 106

        https://leetcode.com/problems/path-with-minimum-effort/?envType=daily-question&envId=2023-09-16
     */

    public int minimumEffortPath1(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        int[][] effort = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(effort[i], Integer.MAX_VALUE);
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        queue.offer(new int[]{0, 0, 0});
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
            int currEffort = cell[2];
            if (row == rows - 1 && col == cols - 1) {
                return currEffort;
            }
            if (currEffort > effort[row][col]) {
                continue;
            }
            effort[row][col] = currEffort;
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    int newEffort = Math.max(currEffort, Math.abs(heights[row][col] - heights[newRow][newCol]));
                    if (newEffort < effort[newRow][newCol]) {
                        queue.offer(new int[]{newRow, newCol, newEffort});
                    }
                }
            }
        }
        return -1;
    }

    public int minimumEffortPath2(int[][] heights) {
        // Create a priority queue containing pairs of cells
        // and their respective distance from the source cell in the
        // form {diff, {row of cell, col of cell}}.
        PriorityQueue<Tuple> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x.distance));
        int n = heights.length;
        int m = heights[0].length;
        // Create a distance matrix with initially all the cells marked as
        // unvisited and the dist for source cell (0,0) as 0.
        int[][] dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], (int) (1e9));
        }
        dist[0][0] = 0;
        pq.add(new Tuple(0, 0, 0));
        // The following delta rows and delta columns array are created such that
        // each index represents each adjacent node that a cell may have
        // in a direction.
        int[] deltaRows = {-1, 0, 1, 0};
        int[] deltaColumns = {0, 1, 0, -1};
        // Iterate through the matrix by popping the elements out of the queue
        // and pushing whenever a shorter distance to a cell is found.
        while (pq.size() != 0) {
            Tuple it = pq.peek();
            pq.remove();
            int diff = it.distance;
            int row = it.row;
            int col = it.col;
            // Check if we have reached the destination cell,
            // return the current value of difference (which will be min).
            if (row == n - 1 && col == m - 1) return diff;
            // row - 1, col
            // row, col + 1
            // row - 1, col
            // row, col - 1
            for (int i = 0; i < 4; i++) {
                int newRow = row + deltaRows[i];
                int newColumn = col + deltaColumns[i];
                // Checking validity of the cell.
                if (newRow >= 0 && newColumn >= 0 && newRow < n && newColumn < m) {
                    // Effort can be calculated as the max value of differences
                    // between the heights of the node and its adjacent nodes.
                    int newEffort = Math.max(Math.abs(heights[row][col] - heights[newRow][newColumn]), diff);
                    // If the calculated effort is less than the prev value
                    // we update as we need the min effort.
                    if (newEffort < dist[newRow][newColumn]) {
                        dist[newRow][newColumn] = newEffort;
                        pq.add(new Tuple(newEffort, newRow, newColumn));
                    }
                }
            }
        }
        // If the destination is unreachable.
        return 0;
    }

    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        int[][] dist = new int[rows][cols];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.add(new int[]{0, 0, 0});
        for (int i = 0; i < rows; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int effort = top[0], x = top[1], y = top[2];
            if (effort > dist[x][y]) continue;
            if (x == rows - 1 && y == cols - 1) return effort;
            for (int[] direction : directions) {
                int nx = x + direction[0], ny = y + direction[1];
                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols) {
                    int new_effort = Math.max(effort, Math.abs(heights[x][y] - heights[nx][ny]));
                    if (new_effort < dist[nx][ny]) {
                        dist[nx][ny] = new_effort;
                        minHeap.add(new int[]{new_effort, nx, ny});
                    }
                }
            }
        }
        return -1;
    }

    record Tuple(int distance, int row, int col) {
    }
}