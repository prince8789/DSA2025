class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int num = asteroids[i];

            if (st.size() == 0 || num > 0) {
                st.push(num);
            } 
            else {
                // Only check collision when top > 0 and num < 0
                while (!st.isEmpty() && st.peek() > 0 && num < 0) {

                    int top = st.peek();
                    int modval = Math.abs(num);

                    if (top == modval) {
                        st.pop();   // both destroyed
                        num = 0;    // mark current destroyed
                        break;
                    } 
                    else if (top > modval) {
                        num = 0;    // current destroyed
                        break;
                    } 
                    else {
                        st.pop();   // top destroyed
                    }
                }

                if (num != 0) {
                    st.push(num);
                }
            }
        }

        int size = st.size();
        int[] ans = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}