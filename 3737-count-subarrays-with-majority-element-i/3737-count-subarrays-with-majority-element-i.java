class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        for(int i =0;i<nums.length;i++){
            int ccount = 0;
            for(int j =i;j<nums.length;j++){               
                if(nums[j]==target){
                    ccount++;
                }
                if(ccount>(j-i+1)/2){
                    count++;
                }
            }
        }
        return count;
        
    }
}