class Solution {
    public int minPartitions(String n) {
        int nm =0;
        for(int i =0;i<n.length();i++){
            nm = Math.max(nm,n.charAt(i)-'0');
        }
        return nm;
        
    }
}