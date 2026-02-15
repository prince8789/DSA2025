class Solution {
    public int[] transformArray(int[] nums) {
        int even =0,odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) even++;
            else odd++;
        }
        for(int i=0;i<nums.length;i++){
            if(even>0){
                even--;
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        return nums;
        
    }
}