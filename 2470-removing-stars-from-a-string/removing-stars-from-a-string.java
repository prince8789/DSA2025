class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                st.pop();
            }
            else st.push(ch);
        }
        StringBuilder sc = new StringBuilder();
        while(st.size()>0){
            sc.append(st.pop());
        }
        return sc.reverse().toString();
        
    }
}