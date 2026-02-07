class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            st1.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++){
            st2.add(nums2[i]);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int num :st1){
            if(!st2.contains(num)){
                list1.add(num);
            }
        }
        for(int num : st2){
            if(!st1.contains(num)){
                list2.add(num); 
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;
    }
}