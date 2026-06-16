class Solution {
    public String processStr(String s) {
        StringBuilder st = new StringBuilder();
        for(int i =0;i< s.length();i++){
            char ch = s.charAt(i);
            if(ch=='#'){
                st.append(st);
            }
            else if(ch=='%'){
                st.reverse();
            }
            else if(ch=='*'){
                if(st.length()>0){
                    st.deleteCharAt(st.length() - 1);
                }
            }
            else{
                st.append(ch);
            }
        }
        return st.toString();
        
    }
}