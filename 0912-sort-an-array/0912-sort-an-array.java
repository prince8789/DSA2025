class Solution {
    public int[] sortArray(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int min = nums[0] , max = nums[0];
        for(int i =0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }

            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }
        int idx = 0;
        for(int i =min;i<=max;i++){
            if(hm.containsKey(i)){
                while(hm.get(i)>0){
                    nums[idx]=i;
                    idx++;
                    hm.put(i,hm.get(i)-1);
                }
            }
        }
        return nums;
    }
}