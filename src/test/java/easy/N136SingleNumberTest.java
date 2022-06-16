package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N136SingleNumberTest {

    N136SingleNumber singleNumber = new N136SingleNumber();

    @Test
    void singleNumber() {
        int actual = singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2});
        assertEquals(4, actual);
    }
}