package medium;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class N215KthLargestElementInAnArrayTest {

    private final static N215KthLargestElementInAnArray kthLargestElementInAnArray = new N215KthLargestElementInAnArray();

    /*
        Input: nums = [3,2,1,5,6,4], k = 2
        Output: 5
     */
    @Test
    void findKthLargest1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int actual = kthLargestElementInAnArray.findKthLargest(nums, 2);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void findKthLargestPQ1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int actual = kthLargestElementInAnArray.findKthLargestPQ(nums, 2);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void findKthLargestQS1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int actual = kthLargestElementInAnArray.findKthLargestQuickSelect(nums, 2);
        int expected = 5;
        assertEquals(expected, actual);
    }

    /*
        Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
        Output: 4
     */
    @Test
    void findKthLargest2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int actual = kthLargestElementInAnArray.findKthLargest(nums, 4);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void findKthLargestPQ2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int actual = kthLargestElementInAnArray.findKthLargestPQ(nums, 4);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void findKthLargestQS2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int actual = kthLargestElementInAnArray.findKthLargestQuickSelect(nums, 4);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Benchmark
    public int BenchStdSort(){
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6, 3, 2, 3, 1, 2, 4, 5, 5, 6};
        return kthLargestElementInAnArray.findKthLargest(nums, 4);
    }

    @Benchmark
    public int BenchPQ(){
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6, 3, 2, 3, 1, 2, 4, 5, 5, 6};
        return kthLargestElementInAnArray.findKthLargestPQ(nums, 4);
    }

    @Benchmark
    public int BenchQS(){
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6, 3, 2, 3, 1, 2, 4, 5, 5, 6};
        return kthLargestElementInAnArray.findKthLargestQuickSelect(nums, 4);
    }
}