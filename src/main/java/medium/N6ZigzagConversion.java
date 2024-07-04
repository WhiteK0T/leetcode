package medium;

public class N6ZigzagConversion {
    /*
        6. Zigzag Conversion
        The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
        (you may want to display this pattern in a fixed font for better legibility)

        P   A   H   N
        A P L S I I G
        Y   I   R

        And then read line by line: "PAHNAPLSIIGYIR"
        Write the code that will take a string and make this conversion given a number of rows:

        string convert(string s, int numRows);

        Constraints:
            1 <= s.length <= 1000
            s consists of English letters (lower-case and upper-case), ',' and '.'.
            1 <= numRows <= 1000
     */

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows == s.length()) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }
        int row = 0;
        int direction = 1;
        for (int i = 0; i < s.length(); i++) {
            rows[row].append(s.charAt(i));
            if (row == 0) {
                direction = 1;
            } else if (row == numRows - 1) {
                direction = -1;
            }
            row += direction;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : rows) {
            result.append(stringBuilder);
        }
        return result.toString();
    }
}