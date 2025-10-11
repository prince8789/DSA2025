import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer>newlist = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                newlist.add(i);
            }
        }
        return newlist;

        
    }
}