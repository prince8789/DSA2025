class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> st = new ArrayList<>();
        
        generate(st , "",n,n);
        return st;
        
    }
    void generate(List<String> st, String s,int left , int right){
        if(left == 0  && right == 0){
            st.add(s);
            return ;
        }
        if(left > 0 ){
            generate(st,s+"(",left-1,right);
        }
        if(right > left){
            generate(st, s+")",left,right-1);
        }
    }
}