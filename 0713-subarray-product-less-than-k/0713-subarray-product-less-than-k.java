class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            int pro =1;
            // if(nums[i]<k){
            //         count++;
            //     }
            // else{
            //     break;
            // }
            for(int j=i;j<nums.length;j++ ){
                pro=pro*nums[j];
                if(pro<k){
                    count++;
                }
                else{
                    break;
                }
            }
            pro =1;
        }
        return count;
        
    }
}