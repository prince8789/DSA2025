class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer ,Integer> hm = new HashMap<>();
        int a=0;
        int[] ans = new int[2];
        for(int i =0;i<nums.length;i++){
            int n = nums[i];
            if(!hm.containsKey(n)){
                hm.put(n,i);
            }
            else{
                ans[a++]=n;
            }
        }
        return ans;
        
    }
}