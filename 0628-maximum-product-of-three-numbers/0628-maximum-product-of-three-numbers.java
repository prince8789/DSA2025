class Solution {
    public int maximumProduct(int[] nums) {

        int n1 = Integer.MIN_VALUE;
        int n2 = Integer.MIN_VALUE;
        int n3 = Integer.MIN_VALUE;

        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;

        for (int num : nums) {

            // Update three largest
            if (num >= n1) {
                n3 = n2;
                n2 = n1;
                n1 = num;
            } else if (num >= n2) {
                n3 = n2;
                n2 = num;
            } else if (num > n3) {
                n3 = num;
            }

            // Update two smallest
            if (num <= s1) {
                s2 = s1;
                s1 = num;
            } else if (num < s2) {
                s2 = num;
            }
        }

        return Math.max(n1 * n2 * n3, n1 * s1 * s2);
    }
}