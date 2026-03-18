class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int []ans = new int[nums.length];
        int a=0;
        int b =0;
        for(int i =0;i<ans.length;i++){
            if(nums[i]<pivot){
                ans[a++]=nums[i];
            }
            else if(nums[i]==pivot){
                b++;
            }
        }
        while(b>0){
            ans[a++]=pivot;
            b--;
        }
        for(int i =0;i<ans.length;i++){
            if(nums[i]>pivot){
                ans[a++]=nums[i];
            }
        }
        return ans;
        
    }
}