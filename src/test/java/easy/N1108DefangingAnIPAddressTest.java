package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N1108DefangingAnIPAddressTest {

    private final N1108DefangingAnIPAddress defangingAnIPAddress = new N1108DefangingAnIPAddress();

    @Test
    void defangIPaddr1() {
        String actual = defangingAnIPAddress.defangIPaddr("1.1.1.1");
        String expected = "1[.]1[.]1[.]1";
        assertEquals(expected, actual);
    }

    @Test
    void defangIPaddr2() {
        String actual = defangingAnIPAddress.defangIPaddr("255.100.50.0");
        String expected = "255[.]100[.]50[.]0";
        assertEquals(expected, actual);
    }
}