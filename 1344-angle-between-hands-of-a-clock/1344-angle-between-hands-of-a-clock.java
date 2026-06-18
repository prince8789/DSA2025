class Solution {
    public double angleClock(int hour, int minutes) {
        hour = hour%12;
        double h = 30*hour+0.5*minutes;
        double m =6*minutes;
        double ans= Math.abs(m-h);
        return Math.min(ans,360-ans);
    }
}