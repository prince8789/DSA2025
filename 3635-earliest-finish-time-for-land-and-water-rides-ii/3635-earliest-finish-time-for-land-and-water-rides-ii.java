class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int land = Integer.MAX_VALUE;
        int water = Integer.MAX_VALUE;
        int land_water=Integer.MAX_VALUE;
        int water_land = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for(int i =0;i<n;i++){
            land = Math.min(land,landStartTime[i]+landDuration[i]);
        }
        for(int i =0;i<m;i++){
            water = Math.min(water,waterStartTime[i]+waterDuration[i]);
            land_water = Math.min(land_water,Math.max(land,waterStartTime[i])+waterDuration[i]);
        }
        for(int i =0;i<n;i++){
            water_land = Math.min(water_land,Math.max(water,landStartTime[i])+landDuration[i]);

        }
        return Math.min(water_land,land_water);
        
    }
}