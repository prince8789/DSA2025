class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length-1;
        if(n<3){
            return false;
        }
        int i =0;
        while(i<n && nums[i]<nums[i+1]){
            i++;
        }
        if(i==n || i == 0){
            return false;
        }
        int dis =i;
        while(i<n && nums[i]>nums[i+1]){
            i++;
        }
        if(i==dis || i==n){
            return false;
        }
        while(i<n && nums[i]<nums[i+1]){
            i++;
        }
        return i ==n;
    }
}