class Solution {
    public int dominantIndices(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            int sum =0;
            int j;
            for( j=i+1;j<nums.length;j++){
                 sum =sum+nums[j]; 
            }
            double right = nums.length-i-1;
            double avg = (double)sum/right;
            if(nums[i]>avg){
                count++;
            }
        }
        return count;
    }
}