package medium;

public class N1423MaximumPointsYouCanObtainFromCards {

    /*
        1423. Maximum Points You Can Obtain from Cards
        There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
        In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
        Your score is the sum of the points of the cards you have taken.
        Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

        Constraints:
            *   1 <= cardPoints.length <= 10 v 5
            *   1 <= cardPoints[i] <= 10 v 4
            *   1 <= k <= cardPoints.length

        https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
     */

    public int maxScore(int[] cardPoints, int k) {
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }
        int best = total;
        for (int i = k - 1, j = cardPoints.length - 1; i >= 0; i--, j--) {
            total += cardPoints[j] - cardPoints[i];
            best = Math.max(best, total);
        }
        return best;
    }
}
