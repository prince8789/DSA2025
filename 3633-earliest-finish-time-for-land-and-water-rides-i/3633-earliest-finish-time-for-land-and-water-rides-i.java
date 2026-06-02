class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int land = Integer.MAX_VALUE;
        int water = Integer.MAX_VALUE;
        int land_water = Integer.MAX_VALUE;
        int water_land = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            land = Math.min(land,(landStartTime[i]+landDuration[i]));
        }
        
        for(int i =0;i<m;i++){
            water = Math.min(water,waterStartTime[i]+waterDuration[i]);
            land_water = Math.min(land_water,Math.max(waterStartTime[i],land)+waterDuration[i]);
        }
        for(int i =0;i<n;i++){
            water_land = Math.min(water_land,Math.max(landStartTime[i],water)+landDuration[i]);
        }

        return Math.min(land_water,water_land);
    }
}