class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
            char ch1 = t.charAt(i);
            arr[ch1 -'a']--;
        }
        for(int i =0;i<26;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}