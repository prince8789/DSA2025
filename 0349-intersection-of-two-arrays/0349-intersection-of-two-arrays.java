class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i : nums1){
            hs.add(i);
        }
        for(int i :nums2){
            if(hs.contains(i)){
                result.add(i);
            }
        }
        int[] ans = new int[result.size()];
        int i =0;
        for(int num :result){
            ans[i++]=num;
        }
        return ans;
    }
}