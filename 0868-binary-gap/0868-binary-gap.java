class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int i =0,j=1;
        int count =0;
        while(j<s.length()){
            if(s.charAt(j)=='1'){
                if(s.charAt(i)=='1'){
                    int dif =j-i;
                    count = Math.max(count,dif);
                    i=j;
                }
            }
            j++;
           
        }
        return count;
    }
}