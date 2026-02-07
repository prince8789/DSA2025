class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> st = new HashSet<>();
        for(int i =0;i<friends.length;i++){
            st.add(friends[i]);

        }
        int[] ans = new int[friends.length];
        int a=0;
        for(int i =0;i<order.length;i++){
            if(st.contains(order[i])){
                ans[a]=order[i];
                a++;
            }

        }
        return ans;
        
    }
}