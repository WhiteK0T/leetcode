package hard;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class N135CandyTest {

    private static final N135Candy CANDY = new N135Candy();

    /* Example 1:
        Input: ratings = [1,0,2]
        Output: 5
        Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.      */
    @Test
    void candy1() {
        int[] input = {1, 0, 2};
        int expected = 5;
        int actual = CANDY.candy(input);
        assertThat(actual, equalTo(expected));
    }

    /* Example 2:
        Input: ratings = [1,2,2]
        Output: 4
        Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
        The third child gets 1 candy because it satisfies the above two conditions.     */
    @Test
    void candy2() {
        int[] input = {1, 2, 2};
        int expected = 4;
        int actual = CANDY.candy(input);
        assertThat(actual, equalTo(expected));
    }
}