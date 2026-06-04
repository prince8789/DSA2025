class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i =num1;i<=num2;i++){
            int count =0;
            String str = String.valueOf(i);
            for(int j =1;j<str.length()-1;j++){
                int x = str.charAt(j-1)-'0';
                int y = str.charAt(j)-'0';
                int z = str.charAt(j+1)-'0';
                if((y>x && y>z) || (y<x && y<z)){
                    count++;
                }
            }
            ans+=count;

        }
        return ans;
        
    }
}