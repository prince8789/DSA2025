class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i :nums){
            hs.add(i);
        }
        if(hs.size()==nums.length){
            return false;
        }
        return true;
        
    }
}