package easy;

public class N1470ShuffleTheArray {

    /*
        1470. Shuffle the Array
        Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

        Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0, resIndex = 0; i < n; i++) {
            result[resIndex++] = nums[i];
            result[resIndex++] = nums[n + i];
        }
        return result;
    }
}
