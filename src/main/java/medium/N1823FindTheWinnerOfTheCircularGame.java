package medium;

public class N1823FindTheWinnerOfTheCircularGame {
    /*
    1823. Find the Winner of the Circular Game
    There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in
    clockwise order. More formally, moving clockwise from the i*th friend brings you to the (i+1)th friend for 1 <= i < n,
    and moving clockwise from the n*th friend brings you to the 1*st friend.

    The rules of the game are as follows:

    1.Start at the 1*st friend.
    2.Count the next k friends in the clockwise direction including the friend you started at. The counting wraps
      around the circle and may count some friends more than once.
    3.The last friend you counted leaves the circle and loses the game.
    4.If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately
      clockwise of the friend who just lost and repeat.
    5.Else, the last friend in the circle wins the game.

    Given the number of friends, n, and an integer k, return the winner of the game.

    Constraints:
    1 <= k <= n <= 500
    Follow up:
    Could you solve this problem in linear time with constant space?

    https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/?envType=daily-question&envId=2024-07-08
     */

    public int findTheWinner(int n, int k) {
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }
        return result + 1;
    }
}