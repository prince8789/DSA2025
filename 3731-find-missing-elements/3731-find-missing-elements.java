class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        int num = nums[0];
        int i =0;
        int last = nums[nums.length-1];
        while(i<nums.length && num <= last){
            if(num == nums[i]){
                num++;
                i++;
            }
            else if(num < nums[i]){
                l.add(num);
                num++;
            }
        }
        return l;
    }
}