public class ValidAnagram {
    // #242, 1/3/2022

    public static void main(String[] args) {
        System.out.println(isAnagram("dog", "god"));
    }

    public static boolean isAnagram(String s, String t) {
        // O(N) time, O(N) space

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int num : freq) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
