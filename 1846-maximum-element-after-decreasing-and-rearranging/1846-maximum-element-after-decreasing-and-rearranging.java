class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int[] freq = new int[arr.length+1];
        for(int i =0;i<arr.length;i++){
            freq[Math.min(arr[i],arr.length)]++;
        }
        int ans =1;
        for(int i =2;i<freq.length;i++){
            ans = Math.min(ans+freq[i],i);
        }
        
        return ans;
    }
}