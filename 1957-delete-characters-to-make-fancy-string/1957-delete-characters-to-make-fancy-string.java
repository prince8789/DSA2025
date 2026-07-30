class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }
        StringBuilder  st = new StringBuilder();
        st.append(s.charAt(0));
        st.append(s.charAt(1));
        for(int i =2;i<s.length();i++){
            if((st.charAt(st.length()-1) != st.charAt(st.length()-2)) || (st.charAt(st.length()-1) != s.charAt(i))){
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}