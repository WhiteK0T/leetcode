package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class N406QueueReconstructionByHeight {

    /*
        406. Queue Reconstruction by Height
        You are given an array of people, people, which are the attributes of some people in a queue
        (not necessarily in order). Each people[i] = [hi, ki] represents the ith person of height hi with exactly ki
        other people in front who have a height greater than or equal to hi.

        Reconstruct and return the queue that is represented by the input array people.
        The returned queue should be formatted as an array queue, where queue[j] = [hj, kj] is the attributes of the
        jth person in the queue (queue[0] is the person at the front of the queue).

        Constraints:

        1 <= people.length <= 2000
        0 <= hi <= 10 v 6
        0 <= ki < people.length
        It is guaranteed that the queue can be reconstructed.

        https://leetcode.com/problems/queue-reconstruction-by-height/
     */

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (int[] a, int[] b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<int[]> ordered = new LinkedList<>();

        for (int[] p : people) {
            ordered.add(p[1], p);
        }

        return ordered.toArray(new int[people.length][2]);
    }
}
