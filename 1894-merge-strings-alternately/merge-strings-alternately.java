class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int k = Math.min(n,m);
        for(int i =0;i<k;i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        if(n != m){
            if(n>m){
            str.append(word1.substring(k));
            }
            else{
                str.append(word2.substring(k));
            }
        }
    return str.toString();
    }
    //String str1 ="str";

}