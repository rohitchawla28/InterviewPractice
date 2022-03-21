public class HappyNumber {
    // #202, 1/5/2022

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        // O(logN) time, O(1) space

        int slow = n;
        int fast = getNext(n);

        while (fast != 1 && fast != slow) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    public static int getNext(int x) {
        int sum = 0;
        while (x > 0) {
            sum += Math.pow(x % 10, 2);
            x /= 10;
        }
        return sum;
    }
}
