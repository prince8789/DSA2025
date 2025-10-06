class Solution {
    public void rotate(int[] nums, int k) {
        int []ans = new int[nums.length];
         k= k%nums.length;
        int start =0;
        for(int i =nums.length-k;i<nums.length;i++){
            ans[start++]=nums[i];
        }
        for(int i =k;i<ans.length;i++){
            ans[i]=nums[i-k];
        }
        for(int i =0;i<nums.length;i++){
            nums[i]=ans[i];
        }
        
    }
}