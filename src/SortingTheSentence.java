public class SortingTheSentence {
    // #1859, 3/22/2022

    public static void main(String[] args) {
        System.out.println(sortTheSentence("Myself2 Me1 I4 and3"));
    }

    public static String sortTheSentence(String s) {
        // O(N) time, O(N) space??

        String[] st = s.split(" ");
        String[] words = new String[st.length];

        for (String elem : st) {
            int num = elem.charAt(elem.length() - 1) - '0';
            words[num - 1] = elem.substring(0, elem.length() - 1);
        }

        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(word).append(" ");
        }
        return res.toString().substring(0, res.length() - 1);
    }
}
