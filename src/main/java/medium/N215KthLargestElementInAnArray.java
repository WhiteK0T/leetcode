package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class N215KthLargestElementInAnArray {

    /*
        215. K-th Largest Element in an Array
        Given an integer array nums and an integer k, return the k-th largest element in the array.
        Note that it is the k-th largest element in the sorted order, not the k-th distinct element.

        Constraints:
            1 <= k <= nums.length <= 104
            -104 <= nums[i] <= 104

        https://leetcode.com/problems/kth-largest-element-in-an-array/
     */

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargestPQ(int[] nums, int k) {
        /*Queue<Integer> queue = new PriorityQueue<>(k + 1);
        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();*/
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : nums) {
            maxHeap.offer(n);
        }
        while (--k > 0) {
            maxHeap.poll();
        }

        return maxHeap.poll();
    }

    private final Random rnd = new Random();

    public int findKthLargestQuickSelect(int[] nums, int k) {
        int index = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int pivotIdx = partition(nums, lo, hi);
            if (pivotIdx == index) {
                break;
            } else if (pivotIdx < index) {
                lo = pivotIdx + 1;
            } else {
                hi = pivotIdx - 1;
            }
        }
        return nums[index];
    }

    private int partition(int[] nums, int lo, int hi) {
        swap(nums, hi, lo + rnd.nextInt(hi - lo));
        int pivot = nums[hi];
        int j = lo;
        for (int i = lo; i < hi; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, j++);
            }
        }
        swap(nums, hi, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}