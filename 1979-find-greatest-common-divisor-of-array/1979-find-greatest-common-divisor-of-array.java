class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        return gcd(min,max);
        
    }
    int gcd(int min, int max){
        if(max==0){
            return min;
        }
        return gcd(max,min%max);
    }
}