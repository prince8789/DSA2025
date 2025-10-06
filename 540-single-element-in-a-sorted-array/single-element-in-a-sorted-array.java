class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];

        }
        int i ;
        for(i =1;i<nums.length;i++){
            nums[i]=nums[i]^nums[i-1];
        }
        return nums[--i];
        
    }
}