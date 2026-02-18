class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder st = new StringBuilder();
        while(n>0){
            st.append(n%2);
            n=n/2;
        }
        for(int i =0;i<st.length()-1;i++){
            if(st.charAt(i)==st.charAt(i+1)) return false;
        }
        return true;
    }
}