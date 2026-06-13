class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String st ="";
        char[] arr = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        for(int i =0;i<words.length;i++){
            String s = words[i];
            int sum =0;
            for(int j =0;j<s.length();j++){
                char ch = s.charAt(j);
                sum = sum+weights[ch-'a'];

            }
            sum = sum%26;
            st=st+arr[sum];
            sum =0;
        }
        return st;
        
    }
}