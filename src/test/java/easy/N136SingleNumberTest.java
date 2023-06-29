package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N136SingleNumberTest {

    private final N136SingleNumber singleNumber = new N136SingleNumber();

    @Test
    void singleNumber() {
        int[] nums = {4, 1, 2, 1, 2};
        int actual = singleNumber.singleNumber(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }
}