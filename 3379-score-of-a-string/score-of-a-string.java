class Solution {
    public int scoreOfString(String s) {
        int score =0;
        for(int i =0;i<s.length()-1;i++){
            // int a = (int)s.charAt(i);
            // int b = (int)s.charAt(i+1);
            score += Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
            //score += diff;
        }
        return score;
        
    }
}