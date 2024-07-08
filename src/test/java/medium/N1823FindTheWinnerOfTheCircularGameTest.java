package medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class N1823FindTheWinnerOfTheCircularGameTest {

    public static final N1823FindTheWinnerOfTheCircularGame FIND_THE_WINNER_OF_THE_CIRCULAR_GAME = new N1823FindTheWinnerOfTheCircularGame();

    /*  Example 1:
        Input: n = 5, k = 2
        Output: 3
        Explanation: Here are the steps of the game:
        1) Start at friend 1.
        2) Count 2 friends clockwise, which are friends 1 and 2.
        3) Friend 2 leaves the circle. Next start is friend 3.
        4) Count 2 friends clockwise, which are friends 3 and 4.
        5) Friend 4 leaves the circle. Next start is friend 5.
        6) Count 2 friends clockwise, which are friends 5 and 1.
        7) Friend 1 leaves the circle. Next start is friend 3.
        8) Count 2 friends clockwise, which are friends 3 and 5.
        9) Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.
        https://assets.leetcode.com/uploads/2021/03/25/ic234-q2-ex11.png     */
    @Test
    void findTheWinner1() {
        int n = 5;
        int k = 2;
        int actual = FIND_THE_WINNER_OF_THE_CIRCULAR_GAME.findTheWinner(n, k);
        int expected = 3;
        assertThat(actual, is(equalTo(expected)));
    }

    /*  Example 2:
        IInput: n = 6, k = 5
        Output: 1
        Explanation: The friends leave in this order: 5, 4, 6, 2, 3. The winner is friend 1.     */
    @Test
    void findTheWinner2() {
        int n = 6;
        int k = 5;
        int actual = FIND_THE_WINNER_OF_THE_CIRCULAR_GAME.findTheWinner(n, k);
        int expected = 1;
        assertThat(actual, is(equalTo(expected)));
    }
}