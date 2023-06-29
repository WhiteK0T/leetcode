package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N268MissingNumberTest {

    private final N268MissingNumber missingNumber = new N268MissingNumber();

    @Test
    void missingNumber1() {
        int actual = missingNumber.missingNumber(new int[]{3, 0, 1});
        assertEquals(2, actual);
    }

    @Test
    void missingNumber2() {
        int res = missingNumber.missingNumber(new int[]{0, 1});
        assertEquals(2, res);
    }

    @Test
    void missingNumber3() {
        int res = missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        assertEquals(8, res);
    }

    @Test
    void missingNumber4() {
        int res = missingNumber.missingNumber(new int[]{0});
        assertEquals(1, res);
    }
}