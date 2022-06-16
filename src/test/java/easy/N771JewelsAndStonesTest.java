package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N771JewelsAndStonesTest {

    N771JewelsAndStones jewelsAndStones = new N771JewelsAndStones();

    /*
        Input: jewels = "aA", stones = "aAAbbbb"
        Output: 3
     */
    @Test
    void numJewelsInStones1() {
        int actual = jewelsAndStones.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, actual);
    }

    /*
        Input: jewels = "z", stones = "ZZ"
        Output: 0
     */
    @Test
    void numJewelsInStones2() {
        int actual = jewelsAndStones.numJewelsInStones("z", "ZZ");
        assertEquals(0, actual);
    }
}