class Solution {
    public String makeFancyString(String s) {
        StringBuilder st = new StringBuilder(s);
        int i =1;
        while(i<st.length()-1){
            if(st.charAt(i)==st.charAt(i-1) && st.charAt(i)==st.charAt(i+1)){
                st.deleteCharAt(i);
            }
            else i++;
        }
        return st.toString();
    }
}