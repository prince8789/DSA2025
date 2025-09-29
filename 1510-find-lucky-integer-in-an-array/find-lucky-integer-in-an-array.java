class Solution {
    public int findLucky(int[] arr) {
        int [] freq = new int [505];
        for(int i =0;i<arr.length;i++){
            freq[arr[i]] = freq[arr[i]]+1;
        }
        for(int i =freq.length-1;i>0;i--){
            if(i==freq[i]){
                return i;
            }
        }
        return -1;
        
    }
}