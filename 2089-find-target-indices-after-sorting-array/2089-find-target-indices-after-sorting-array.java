class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> l = new ArrayList<>();
        for(int i =0; i< nums.length ; i++){
            if(target == nums[i]){
                l.add(i);
            }
        }
        return l;

        
    }
}