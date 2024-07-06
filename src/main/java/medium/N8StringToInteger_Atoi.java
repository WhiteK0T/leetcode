package medium;

public class N8StringToInteger_Atoi {
    /*
    8. String to Integer (atoi)
    Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
    The algorithm for myAtoi(string s) is as follows:

    Whitespace: Ignore any leading whitespace (" ").
    Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
    Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the
    string is reached. If no digits were read, then the result is 0.
    Rounding: If the integer is out of the 32-bit signed integer range [-2*31, 2*31 - 1], then round the integer to remain
    in the range. Specifically, integers less than -2*31 should be rounded to -2*31, and integers greater than 2*31 - 1
    should be rounded to 2*31 - 1.

    Return the integer as the final result.

    Constraints:
        0 <= s.length <= 200
        s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
     */

    public int myAtoi(String s) {
        long result = 0;
        int indexBeginStr = 0;
        for (; indexBeginStr < s.length() && s.charAt(indexBeginStr) == ' '; indexBeginStr++) {
        }

        boolean negative = false;
        for (int i = indexBeginStr; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == indexBeginStr) {
                if (c == '-') {
                    negative = true;
                    continue;
                } else if (c == '+') {
                    continue;
                }
            }
            if (c >= '0' && c <= '9') {
                result = result * 10 + (c - '0');
                if (result > Integer.MAX_VALUE) {
                    break;
                }
            } else {
                break;
            }
        }
        if (negative) {
            result = Math.max(-result, Integer.MIN_VALUE);
        } else {
            result = Math.min(result, Integer.MAX_VALUE);
        }
        return (int) result;
    }
}