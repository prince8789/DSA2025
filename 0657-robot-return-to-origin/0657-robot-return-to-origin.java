class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y =0;
        for(int i =0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='R'){
                x++;
            }
            else if(ch=='L'){
                x--;
            }
            else if(ch=='U'){
                y++;
            }
            else{
                y--;
            }

        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}