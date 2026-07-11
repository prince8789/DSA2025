class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(int num :hm.keySet()){
            if(hm.get(num)>nums.length/3){
                l.add(num);
            }
        }

        return l;
    }
}