class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<nums2.length;i++){
            for(int j =0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    hs.add(nums1[j]);
                }
            }
        }
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i : hs){
            l1.add(i);
        }
       int[] result = new int[l1.size()];
        for(int i = 0; i < l1.size(); i++){
            result[i] = l1.get(i);
        }

        return result;
    }
}