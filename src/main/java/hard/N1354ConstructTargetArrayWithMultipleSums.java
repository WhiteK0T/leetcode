package hard;

import java.util.Collections;
import java.util.PriorityQueue;

public class N1354ConstructTargetArrayWithMultipleSums {

    /*
        1354. Construct Target Array With Multiple Sums
        You are given an array target of n integers. From a starting array arr consisting of n 1's, you may perform the following procedure :
            -  let x be the sum of all elements currently in your array.
            -  choose index i, such that 0 <= i < n and set the value of arr at index i to x.
            -  You may repeat this procedure as many times as needed.

        Return true if it is possible to construct the target array from arr, otherwise, return false.

        Constraints:
            n == target.length
            1 <= n <= 5 * 104
            1 <= target[i] <= 109

        https://leetcode.com/problems/construct-target-array-with-multiple-sums/
     */

    public boolean isPossible(int[] target) {
        long sum = 0;
        int max = 0;
        for (int i = 0; i < target.length; i++) {
            sum += target[i];
            if (target[max] < target[i]) {
                max = i;
            }
        }
        long diff = sum - target[max];
        if (target[max] == 1 || diff == 1) return true;
        if (diff > target[max] || diff == 0 || target[max] % diff == 0) return false;
        target[max] %= diff;
        return isPossible(target);
    }

    public boolean isPossiblePQ(int[] target) {
        if (target.length == 1) return target[0] == 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for (int t : target) {
            pq.add(t);
            sum += t;
        }
        while (pq.peek() != 1) {
            int value = pq.poll();
            long diff = sum - value;
            if (diff == 1) return true;
            if (diff > value || diff == 0 || value % diff == 0) return false;
            value %= diff;
            sum = diff + value;
            pq.offer(value);
        }
        return true;
    }
}
