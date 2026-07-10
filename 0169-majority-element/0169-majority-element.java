class Solution {
    public int majorityElement(int[] nums) {
        int max =Integer.MIN_VALUE;
        int value =0;
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
            if(hm.get(num)>max){
                value = num;
                max=hm.get(num);
            }
        }

        return value;
    }
}