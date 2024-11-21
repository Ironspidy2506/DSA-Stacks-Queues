import java.util.*;

public class CheckParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    if (c == ')' && st.peek() == '(') {
                        st.pop();
                    } else if (c == ']' && st.peek() == '[') {
                        st.pop();
                    } else if (c == '}' && st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input String: ");
        String str = sc.nextLine();

        if (isValid(str)) {
            System.out.println("String is Balanced!");
        } else {
            System.out.println("String is not Balanced!");
        }
        sc.close();
    }
}