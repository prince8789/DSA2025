class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int a=0,b=1;
        for(int i =0;i<nums.length;i++){
            int n = nums[i];
            if(n%2==0){
                ans[a]=n;
                a+=2;
            }
            else{
                ans[b]=n;
                b+=2;
            }
        }
        return ans;
        
    }
}