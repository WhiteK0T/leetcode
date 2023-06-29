package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N630CourseScheduleIIITest {

    private final N630CourseScheduleIII courseScheduleIII = new N630CourseScheduleIII();

    /*
        Input: courses = [[100,200],[200,1300],[1000,1250],[2000,3200]]
        Output: 3
        Explanation:
        There are totally 4 courses, but you can take 3 courses at most:
        First, take the 1st course, it costs 100 days so you will finish it on the 100th day, and ready to take the next course on the 101st day.
        Second, take the 3rd course, it costs 1000 days so you will finish it on the 1100th day, and ready to take the next course on the 1101st day.
        Third, take the 2nd course, it costs 200 days so you will finish it on the 1300th day.
        The 4th course cannot be taken now, since you will finish it on the 3300th day, which exceeds the closed date.
     */
    @Test
    void scheduleCourse1() {
        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        int actual = courseScheduleIII.scheduleCourse(courses);
        int expected = 3;
        assertEquals(expected, actual);
    }

    /*
        Input: courses = [[1,2]]
        Output: 1
    */
    @Test
    void scheduleCourse2() {
        int[][] courses = {{1, 2}};
        int actual = courseScheduleIII.scheduleCourse(courses);
        int expected = 1;
        assertEquals(expected, actual);
    }

    /*
        Input: courses = [[3,2],[4,3]]
        Output: 0
    */
    @Test
    void scheduleCourse3() {
        int[][] courses = {{3, 2}, {4, 3}};
        int actual = courseScheduleIII.scheduleCourse(courses);
        int expected = 0;
        assertEquals(expected, actual);
    }
}