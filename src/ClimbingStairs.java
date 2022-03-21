public class ClimbingStairs {
    // #70, 1/1/2022

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        // O(N) time, O(N) space

//        int[] numWays = new int[n + 1];
//
//        numWays[0] = 1;
//        numWays[1] = 1;
//
//        for (int i = 2; i < numWays.length; i++) {
//            numWays[i] = numWays[i - 2] + numWays[i - 1];
//        }
//        return numWays[n];

        // O(N) time, O(1) space
        int curr = 1;
        int prev = 1;

        for (int i = 0; i < n-1; i++) {
            int temp = curr;

            curr += prev;
            prev = temp;
        }
        return curr;
    }
}