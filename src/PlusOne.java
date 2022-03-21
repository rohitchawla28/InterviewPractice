import java.util.Arrays;

public class PlusOne {
    // #66, 12/31/2021

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
        // O(N) time, O(N+1) space worst case?
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] <= 9) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
