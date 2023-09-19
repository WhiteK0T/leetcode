package medium;

public class N287FindTheDuplicateNumber {
    /*
        287. Find the Duplicate Number

        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

        There is only one repeated number in nums, return this repeated number.

        You must solve the problem without modifying the array nums and uses only constant extra space.


        Constraints:
            1 <= n <= 105
            nums.length == n + 1
            1 <= nums[i] <= n
            All the integers in nums appear only once except for precisely one integer which appears two or more times.

        https://leetcode.com/problems/find-the-duplicate-number/?envType=daily-question&envId=2023-09-19
     */

    public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        // Фаза 1: Находим точку пересечения двух указателей
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        tortoise = nums[0];
        // Фаза 2: Находим вход в цикл
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return hare;
    }

    /*
    Алгоритм работает так, что он рассматривает массив как связный список, где значение в каждом индексе - это следующий
    индекс для перехода. В первой фазе указатели черепахи и зайца двигаются по массиву. Заяц двигается в два раза быстрее,
    чем черепаха. Если в массиве есть цикл, черепаха и заяц в конечном итоге встретятся в одном и том же индексе.

    Во второй фазе черепаха сбрасывается на начальный индекс, и оба указателя движутся с одинаковой скоростью
    (по одному шагу за раз). Они встретятся в точке входа в цикл, которая является повторяющимся числом.

    Временная сложность этого решения составляет O(n), а пространственная сложность - O(1).
     */
}