package easy;

public class N1108DefangingAnIPAddress {
    /*
        1108. Defanging an IP Address
        Given a valid (IPv4) IP address, return a defanged version of that IP address.
        A defanged IP address replaces every period "." with "[.]".
        https://leetcode.com/problems/defanging-an-ip-address/
     */
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder(address.length() * 2);
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                result.append("[.]");
            } else {
                result.append(address.charAt(i));
            }
        }
        return result.toString();
    }
}
