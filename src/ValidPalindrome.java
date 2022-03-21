public class ValidPalindrome {
    // #125, 12/30/2022

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));

            if (!Character.isLetterOrDigit(left)) {
                l++;
            }
            else if (!Character.isLetterOrDigit(right)) {
                r--;
            }
            else {
                if (left != right) {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}
