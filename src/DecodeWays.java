import java.util.Arrays;

public class DecodeWays {
    // #91, 1/3/2022

    public static void main(String[] args) {
        System.out.println(decodeDPArray("12"));
    }

    public static int decodeDPNoArray(String s) {
        // O(N) time, O(1) space

        int n = s.length();

        int prev2 = 0;
        int prev1 = 1;
        int curr = 0;

        for (int i = n-1; i >= 0; i--) {
            curr = 0;
            if (s.charAt(i) != '0') {
                curr = prev1;

                if (i + 1 < s.length()) {
                    if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) <= '6')) {
                        curr += prev2;
                    }
                }
            }
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }

    public static int decodeDPArray(String s) {
        // O(N) time, O(N) space

        int n = s.length();

        int[] dp = new int[n+1];

        dp[n] = 1;
        for (int i = n-1; i >= 0; i--) {
            System.out.println("num: " + s.charAt(i));
            if (s.charAt(i) != '0') {
                dp[i] = dp[i+1];

                if (i + 1 < s.length()) {
                    if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) <= '6')) {
                        dp[i] += dp[i+2];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }

    // recursive sol O(2^n) time, space?
    public static int decodeRec(String s) {
        if (s.isEmpty()) return 0;

        return help(s, 0);
    }

    public static int help(String s, int index) {
        if (index == s.length()) {
            return 1;
        }
        if (s.charAt(index) == '0') {
            return 0;
        }

        int ways = help(s, index + 1);

        if (index + 1 < s.length()) {
            if (s.charAt(index) == '1' || (s.charAt(index) == '2' && s.charAt(index + 1) <= '6')) {
                ways += help(s, index + 2);
            }
        }
        return ways;
    }
}
