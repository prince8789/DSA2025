class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> st = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            st.add(ch);
        }
        return st.size();
        
    }
}