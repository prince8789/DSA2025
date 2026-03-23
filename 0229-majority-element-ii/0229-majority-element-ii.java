class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int a = nums[i];
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }
            else{
                hm.put(a,1);
            }
        }
        int num = nums.length/3;
        ArrayList<Integer> l = new ArrayList<>();
        for(var key : hm.keySet()){
            if(hm.get(key)>num){
                l.add(key);
            }
        }
        return l;
    }
}