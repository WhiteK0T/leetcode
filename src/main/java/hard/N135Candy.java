package hard;

import java.util.Arrays;

public class N135Candy {
    /*
        135. Candy
        There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

        You are giving candies to these children subjected to the following requirements:

          -  Each child must have at least one candy.
          -  Children with a higher rating get more candies than their neighbors.

        Return the minimum number of candies you need to have to distribute the candies to the children.

        Constraints:
            n == ratings.length
            1 <= n <= 2 * 104
            0 <= ratings[i] <= 2 * 104

        https://leetcode.com/problems/candy/?envType=daily-question&envId=2023-09-13
     */

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Инициализация каждого ребенка одной конфетой
        Arrays.fill(candies, 1);

        // Проход слева направо и обновление количества конфет на основе рейтингов
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Проход справа налево и обновление количества конфет на основе рейтингов и предыдущего прохода
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Вычисление общего количества конфет
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}