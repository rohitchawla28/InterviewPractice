import java.util.Stack;

public class ValidParentheses {
    // #20, 1/3/2022

    public static void main(String[] args) {
        System.out.println(isValid("()[]"));
    }

    public static boolean isValid(String s) {
        // O(N) time, O(N) space

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }
            else if (c == ')') {
                if (st.isEmpty() || st.pop() != '(') {
                    return false;
                }
            }
            else if (c == ']') {
                if (st.isEmpty() || st.pop() != '[') {
                    return false;
                }
            }
            else {
                if (st.isEmpty() || st.pop() != '{') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
