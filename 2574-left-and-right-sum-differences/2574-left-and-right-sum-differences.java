class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] rsum = new int[nums.length];
        rsum[rsum.length-1]=0;
        for(int i=rsum.length-2;i>=0;i--){
            rsum[i]=rsum[i+1]+nums[i+1];
        }
        int[] lsum = new int[nums.length];
        lsum[0]=0;
        for(int i =1;i<lsum.length;i++){
            lsum[i]=lsum[i-1]+nums[i-1];
        }
        for(int i =0;i<lsum.length;i++){
            lsum[i]=Math.abs(lsum[i]-rsum[i]);
        }
        return lsum;
    }
}