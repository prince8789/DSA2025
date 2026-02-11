class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int length = nums.length;
        int even =0, odd=0;
        int num=0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int n = nums[i];
            if(n%2==0){
                even++;
            }
            else{
                odd++;
            }
            hm.put(i,n);

        }
        
        for(int i =length-1;i>=0;i--){
            int value =hm.get(i);
            if(value%2==0){
                nums[--even] = value;
            }
            else{
                nums[--length] = value;
            }

        }
        return nums;
        
    }
}