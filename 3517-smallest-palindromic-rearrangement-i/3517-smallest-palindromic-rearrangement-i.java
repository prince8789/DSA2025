class Solution {
    public String smallestPalindrome(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        StringBuilder st = new StringBuilder();
        char mid = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 1) {
                mid = (char) ('a' + i);
            }
            for (int j = 0; j < arr[i] / 2; j++) {
                st.append((char) ('a' + i));
            }
        }
        StringBuilder st1 = new StringBuilder(st);
        if (mid != 0) {
            st.append(mid);

        }
        st.append(st1.reverse());
        return st.toString();
    }
}