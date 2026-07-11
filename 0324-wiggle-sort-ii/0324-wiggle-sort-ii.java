class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int n = nums.length;
        int left = (nums.length+1)/2-1;
        int right = n-1;
        int i =0;
        while(i<n){
            arr[i++]=nums[left--];
            if(i<n){
                arr[i++]=nums[right--];
            }

        }
        for(int j=0;j<nums.length;j++){
            nums[j]=arr[j];
        }
        
    }
}