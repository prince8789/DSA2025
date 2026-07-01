class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int a = word1.length();
        int b = word2.length();
        int n = Math.max(a,b);
        int l=0 , r=0;
        for(int i =0;i<n;i++){
            if(l<a){
                s.append(word1.charAt(l));
                l++;
            }
            if(r<b){
                s.append(word2.charAt(r));
                r++;
            }
        }
        return s.toString();
        
    }
}