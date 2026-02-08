class Solution {
    public boolean isStrictlyPalindromic(int n) {
        StringBuilder st = new StringBuilder();
        while(n>0){
            st.append(n%2);
            n= n/2;
        }
        return st!=st.reverse();
        
    }
}