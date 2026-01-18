class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer>arr = new ArrayList<>();

        arr.add(nums[0]);
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                arr.add(nums[i]);

            }

        }
        for(int i =0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();
        
    }
}