class Solution {
    public void rotate(int[] nums, int k) {
        k= k%nums.length;
        int[] ans = new int[nums.length];
        int a=0;
        for(int i=nums.length-k;i<nums.length;i++){
            ans[a++]=nums[i];

        }
        for(int i=0;i<nums.length-k;i++){
            ans[a++]=nums[i];
        }
        for(int i =0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}