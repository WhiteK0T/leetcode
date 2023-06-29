package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N1423MaximumPointsYouCanObtainFromCardsTest {

    private final N1423MaximumPointsYouCanObtainFromCards maximumPointsYouCanObtainFromCards = new N1423MaximumPointsYouCanObtainFromCards();

    /*
        Input: cardPoints = [1,2,3,4,5,6,1], k = 3
        Output: 12
        Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will
        maximize your total score. The optimal strategy is to take the three cards on the right,
        giving a final score of 1 + 6 + 5 = 12.
     */
    @Test
    void maxScore1() {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int actual = maximumPointsYouCanObtainFromCards.maxScore(cardPoints, k);
        int expected = 12;
        assertEquals(expected, actual);
    }

    /*
        Input: cardPoints = [2,2,2], k = 2
        Output: 4
        Explanation: Regardless of which two cards you take, your score will always be 4.
     */
    @Test
    void maxScore2() {
        int[] cardPoints = {2, 2, 2};
        int k = 2;
        int actual = maximumPointsYouCanObtainFromCards.maxScore(cardPoints, k);
        int expected = 4;
        assertEquals(expected, actual);
    }

    /*
        Input: cardPoints = [9,7,7,9,7,7,9], k = 7
        Output: 55
        Explanation: You have to take all the cards. Your score is the sum of points of all cards.
     */
    @Test
    void maxScore3() {
        int[] cardPoints = {9, 7, 7, 9, 7, 7, 9};
        int k = 7;
        int actual = maximumPointsYouCanObtainFromCards.maxScore(cardPoints, k);
        int expected = 55;
        assertEquals(expected, actual);
    }
}