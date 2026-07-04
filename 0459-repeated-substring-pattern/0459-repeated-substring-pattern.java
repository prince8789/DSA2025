class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i =s.length()/2;i>0;i--){
            if(s.length()%i ==0){
                String st = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j =1;j<=s.length()/i;j++){
                    sb.append(st);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }

        }
        return false;
    }
}