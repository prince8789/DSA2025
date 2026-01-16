class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left =0;
        int right = numbers.length-1;
        while(left<right){
            int sum =numbers[left]+numbers[right];
            if(target==sum){
                ans[0]=++left;
                ans[1]=++right;
                return ans;
            }
            else if(target<sum){
                right--;
            }
            else left++;
        }
        return ans;
        
    }
}