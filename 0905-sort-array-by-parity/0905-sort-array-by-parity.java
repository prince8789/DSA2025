class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int odd=0, even=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        int a =0;
        for(int i=0;i<ans.length;i++){
            if(nums[i]%2==0){
                ans[a++]=nums[i];
            }
            else{
                ans[even++]= nums[i];
            }
        }
        return ans;
        
    }
}