class Solution {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String invert(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='0'){
                sb.append(1);
            }
            else sb.append(0);
        }
        return sb.toString();
    }
    public char findKthBit(int n, int k) {
        String s = "0";
        for(int i =2;i<=n;i++){
          s = s + "1" + reverse(invert(s)) ; 
        }
        return s.charAt(k-1);
    }
}