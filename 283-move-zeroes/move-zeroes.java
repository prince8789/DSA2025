class Solution {
    public void moveZeroes(int[] nums) {
        int noOfZero =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                noOfZero++;
            }
        }
        int start =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[start]=nums[i];
                start++;
            }
            if(i>nums.length-1-noOfZero){
                nums[i]=0;
            }

        }
    }
}