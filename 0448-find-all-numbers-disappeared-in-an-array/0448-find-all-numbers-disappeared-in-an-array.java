class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int i =0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i =1;i<arr.length;i++){
            if(arr[i]==0){
                l.add(i);
            }
        }
        return l;
        
    }
}