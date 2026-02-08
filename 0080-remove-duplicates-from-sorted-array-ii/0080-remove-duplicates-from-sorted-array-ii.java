class Solution {
    public int removeDuplicates(int[] nums) {
        int j =1,i =2;
        while(i < nums.length){
            if(nums[j] == nums[i]){
               if(nums[j-1]==nums[i]){
                i++;
               }
               else{
                nums[j+1]=nums[i];
                j++;
                i++;
               }
            }
            else{
                nums[j+1]= nums[i];
                j++;
                i++;
            }

        }
        return ++j;
        
    }
}