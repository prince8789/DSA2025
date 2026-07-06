class Solution {
    public int maxSubArray(int[] nums) {
        int sum =Integer.MIN_VALUE;
        int lsum =0;
        for(int i =0;i<nums.length;i++){
            lsum = lsum+nums[i];
            sum = Math.max(sum,lsum);
            if(lsum<0){
                lsum=0;
            }
        }
        return sum;
    }
}