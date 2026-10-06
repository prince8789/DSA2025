class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int sum =Integer.MIN_VALUE, sum1 =0;
        for(int i =0;i<nums.length;i++){
            sum1 += nums[i];
            sum = Math.max(sum, sum1);
            if(sum1 < 0){
                sum1 = 0;
            }
        }
        return sum;
    }
}