public class LongestCommonPrefix {
    // #14, 1/1/2022

    public static void main(String[] args) {
        String[] s = new String[] {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        //

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
