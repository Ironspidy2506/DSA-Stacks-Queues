import java.util.*;

public class NextGreater_2 {
    public static int[] returnNextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = 2 * arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i % arr.length]) {
                st.pop();
            }

            if (i < arr.length) {
                if (st.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = st.peek();
                }
            }

            st.push(arr[i % arr.length]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Start entering array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = returnNextGreater(arr);
        System.out.println("Next Greater Element of every element in circular array is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
