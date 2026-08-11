class Solution {
    public int myAtoi(String s) {

        String st = s.trim();

        // Empty string
        if (st.length() == 0) {
            return 0;
        }

        char ch = st.charAt(0);

        // Decide where digits start
        int start = (ch == '-' || ch == '+') ? 1 : 0;

        // Extract only digits
        String nstr = str(st.substring(start));

        // No digits found
        if (nstr.length() == 0) {
            return 0;
        }

        long num = 0;

        // Convert string to number
        for (int i = 0; i < nstr.length(); i++) {

            int digit = nstr.charAt(i) - '0';

            num = num * 10 + digit;

            // Overflow check
            if (ch == '-' && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            if (ch != '-' && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        return ch == '-' ? (int) -num : (int) num;
    }

    public String str(String s) {

        String str1 = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                str1 += ch;
            } 
            else {
                return str1;
            }
        }

        return str1;
    }
}