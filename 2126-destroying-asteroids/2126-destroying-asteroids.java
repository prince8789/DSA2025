class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currmass = mass;
        for(int i =0;i<asteroids.length;i++){
            if(currmass < asteroids[i]){
                return false;
            }
            currmass+=asteroids[i];
        }
        return true; 
    }
}