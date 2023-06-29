package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N406QueueReconstructionByHeightTest {

    private final N406QueueReconstructionByHeight queueReconstructionByHeight = new N406QueueReconstructionByHeight();

    /*
        Input: people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
        Output: [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]
        Explanation:
        Person 0 has height 5 with no other people taller or the same height in front.
        Person 1 has height 7 with no other people taller or the same height in front.
        Person 2 has height 5 with two persons taller or the same height in front, which is person 0 and 1.
        Person 3 has height 6 with one person taller or the same height in front, which is person 1.
        Person 4 has height 4 with four people taller or the same height in front, which are people 0, 1, 2, and 3.
        Person 5 has height 7 with one person taller or the same height in front, which is person 1.
        Hence [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]] is the reconstructed queue.
     */
    @Test
    void reconstructQueue1() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] actual = queueReconstructionByHeight.reconstructQueue(people);
        int[][] expected = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        assertArrayEquals(expected, actual);
    }

    /*
       Input: people = [[6,0],[5,0],[4,0],[3,2],[2,2],[1,4]]
       Output: [[4,0],[5,0],[2,2],[3,2],[1,4],[6,0]]
    */
    @Test
    void reconstructQueue2() {
        int[][] people = {{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}};
        int[][] actual = queueReconstructionByHeight.reconstructQueue(people);
        int[][] expected = {{4, 0}, {5, 0}, {2, 2}, {3, 2}, {1, 4}, {6, 0}};
        assertArrayEquals(expected, actual);
    }
}