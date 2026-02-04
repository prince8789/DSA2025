class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Integer> mp = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        for(int i =0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!mp.containsKey(ch)){
               return false;
            }
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)-1);
            }
            if(mp.get(ch)==0){
                mp.remove(ch);
            }
        }
        return mp.isEmpty();

        
    }
}