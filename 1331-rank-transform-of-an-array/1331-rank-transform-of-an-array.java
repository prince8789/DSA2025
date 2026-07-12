class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans = arr.clone();
        Arrays.sort(ans);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int a =1;
        for(int i=0;i<ans.length;i++){
            if(!hm.containsKey(ans[i])){
                hm.put(ans[i],a++);
            }
        }
        for(int i =0;i<ans.length;i++){
            ans[i]=hm.get(arr[i]);
        }
        return ans;
    }
}