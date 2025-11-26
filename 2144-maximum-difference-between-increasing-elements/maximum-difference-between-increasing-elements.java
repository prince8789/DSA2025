class Solution {
    public int maximumDifference(int[] nums) {
        int suffix = Integer.MIN_VALUE;
        int max_diff = -1;
        int diff=Integer.MIN_VALUE;
        for(int i =nums.length-1;i>=0;i--){
            suffix = Math.max(suffix,nums[i]);
            if(suffix > nums[i]){
                diff = suffix-nums[i];
            }
            max_diff = Math.max(diff,max_diff);
            
            
        }
        return max_diff;
    }
}