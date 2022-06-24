package hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class N630CourseScheduleIII {
    /*
        630. Course Schedule III
        There are n different online courses numbered from 1 to n. You are given an array courses where
        courses[i] = [durationi, lastDayi] indicate that the ith course should be taken continuously for durationi
        days and must be finished before or on lastDayi.
        You will start on the 1st day and you cannot take two or more courses simultaneously.

        Return the maximum number of courses that you can take.

        Constraints:

            1 <= courses.length <= 104
            1 <= durationi, lastDayi <= 104

        https://leetcode.com/problems/course-schedule-iii/
     */

    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int time = 0;
        for (int[] c : courses) {
            if (time + c[0] <= c[1]) {
                queue.offer(c[0]);
                time += c[0];
            } else if (!queue.isEmpty() && queue.peek() > c[0]) {
                time += c[0] - queue.poll();
                queue.offer(c[0]);
            }
        }
        return queue.size();
    }
}
