class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n1 = 0;
        String st1 = "";
        String st2 = "";
        int a = 0;

        while (n1 < k && a < s.length()) {
            st1 += s.charAt(a);

            if (s.charAt(a) == '1') {
                n1++;
            }

            a++;
        }

        if (n1 < k) {
            return "";
        }

        // Remove leading zeros from initial substring
        while (st1.length() > 0 && st1.charAt(0) == '0') {
            st1 = st1.substring(1);
        }

        st2 = st1;

        for (int i = a; i < s.length(); i++) {
            st1 = st1 + s.charAt(i);

            if (s.charAt(i) == '1') {
                int j = 0;

                // Find first 1
                while (st1.charAt(j) == '0') {
                    j++;
                }

                // Remove first 1 and everything before it
                st1 = st1.substring(j + 1);

                // Remove leading zeros
                while (st1.length() > 0 && st1.charAt(0) == '0') {
                    st1 = st1.substring(1);
                }
            }

            if (st1.length() < st2.length()
                    || (st1.length() == st2.length()
                    && st1.compareTo(st2) < 0)) {
                st2 = st1;
            }
        }

        return st2;
    }
}