class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] ans = {-1};
        for(int i =0;i<nums.length;i++){
            //int n = nums[i];
            if(mp.containsKey(target-nums[i])){
                ans= new int[] {i,mp.get(target-nums[i])};
                return ans;
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return ans;
        
    }
}