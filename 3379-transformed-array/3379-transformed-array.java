class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i =0;i<n;i++){
            int a = nums[i];
            if(a>0){
                result[i]=nums[(i+a)%n];
            }
            if(a<0){
                result[i]=nums[((n-Math.abs(a%n))+i)%n];
            }
            if(a==0){
                result[i]=nums[i];
            }
        }
        return result;
        
    }
}