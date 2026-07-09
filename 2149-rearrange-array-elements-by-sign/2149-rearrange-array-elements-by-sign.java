class Solution {
    public int[] rearrangeArray(int[] nums) {
        int negg = 0;
        int post = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){
                post++;
            }
            else{
                negg++;
            }
        }
        int[] pos = new int[post];
        int[] neg = new int[negg];
        int a=0,b=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){
                pos[a++]=nums[i];
            }
            else{
                neg[b++]=nums[i];
            }
        }
        a=0;
        b=0;
        for(int i =0;i<nums.length;i++){
            nums[i++] = pos[a++];
            nums[i] = neg[b++];
        }
        return nums;
        
    }
}