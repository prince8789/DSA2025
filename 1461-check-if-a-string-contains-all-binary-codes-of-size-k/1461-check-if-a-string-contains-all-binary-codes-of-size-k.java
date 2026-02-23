class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total = 1<<k;
        Set<String> hs = new HashSet<>();
        for(int i =k;i<=s.length();i++){
            String st = s.substring(i-k,i);
            if(!hs.contains(st)){
                hs.add(st);
            }
        }
        if(total == hs.size()){
            return true;
        }
        return false;
        
    }
}