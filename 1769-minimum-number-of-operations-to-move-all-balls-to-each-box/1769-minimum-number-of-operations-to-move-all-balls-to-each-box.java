class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for(int i =0;i<ans.length;i++){
            int idx=0;
            for(int j =0;j<boxes.length();j++){
                char ch =boxes.charAt(j);
                if(ch=='1'){
                    int diff =Math.abs(i-j);
                    idx+=diff;
                }
            }
            ans[i]=idx;
        }
        return ans;
    }
}