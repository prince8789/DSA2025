class Solution {
    public int triangularSum(int[] nums) {
        int i =0;
        while(i<=nums.length-2){
            for(int j =0;j<=nums.length-2;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
            i++;
        }
 
        return nums[0];
    }
}