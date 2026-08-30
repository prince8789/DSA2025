class Solution {
    public int minimumDeletions(int[] nums) {
        
        int min = nums[0];
        int max = nums[0];
        int minidx = 0;
        int maxidx =0;
        if(nums.length<=2){
            return nums.length;
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]< min){
                min = nums[i];
                minidx =i;
            }
            else if(nums[i]> max){
                max = nums[i];
                maxidx =i;
            }
        }
        int left = Math.min(minidx, maxidx);
        int right = Math.max(minidx, maxidx);
        int n = nums.length;

        int deleteFromLeft = right + 1;
        int deleteFromRight = n - left;
        int deleteFromBoth = (left + 1) + (n - right);

        return Math.min(deleteFromLeft,Math.min(deleteFromRight, deleteFromBoth));
    }
}