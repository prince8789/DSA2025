class Solution {
    public int countBinarySubstrings(String s) {
        int prev =0;
        int res = 0;
        int strick =1;
        for(int i =1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                strick++;
            }
            else{               
                res = res+Math.min(prev,strick);
                prev = strick;
                strick=1;
            }

        }
        res = res+Math.min(prev,strick);
        return res;
        
    }
}