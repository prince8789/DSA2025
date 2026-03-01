class Solution {
    public int minPartitions(String n) {
        int nm =0;
        for(int i =0;i<n.length();i++){
            char ch =n.charAt(i);
            nm = Math.max(nm,ch-'0');
        }
        return nm;
        
    }
}