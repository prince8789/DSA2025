class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.size() != 0){
                    st.pop();

                }
                else{
                    st2.push(ch);
                }
            }
        }
        return st.size()+st2.size();
    }
}