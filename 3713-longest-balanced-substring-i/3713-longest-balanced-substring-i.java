class Solution {

    boolean checkBalance(int[] arr){
        int common = 0;

        for(int i = 0; i < 26; i++){
            if(arr[i] == 0) continue;

            if(common == 0){
                common = arr[i];
            }
            else if(arr[i] != common){
                return false;
            }
        }

        return true;
    }

    public int longestBalanced(String s) {
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[26];

            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                if(checkBalance(freq)){
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
}
