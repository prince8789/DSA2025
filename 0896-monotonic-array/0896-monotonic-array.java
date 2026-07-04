class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <=1) return true;
        return (incresing(nums) || decrising(nums));
    }
    boolean incresing(int[] nums){
        for(int i =1;i<nums.length-1;i++){
            if(nums[i-1]> nums[i] || nums[i]>nums[i+1]){
                    return false;
                }
        }
        return true;
    }
    boolean decrising(int[] nums){
        for(int i =1;i<nums.length-1;i++){
            if(nums[i-1]< nums[i] || nums[i]<nums[i+1]){
                    return false;
                }
        }
        return true;
    }
}