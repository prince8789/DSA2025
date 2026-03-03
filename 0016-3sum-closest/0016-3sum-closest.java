class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int cl=Integer.MAX_VALUE;
        int ans = 0;
        for(int i =0;i<nums.length-2;i++){
            for(int j =i+1;j<nums.length-1;j++){
                for(int k =j+1;k<nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int diff = Math.abs(target-sum);
                    if(diff<cl){
                        cl=diff;
                        ans= sum;
                    }
                }
           }
        }
        return ans;
    }
}