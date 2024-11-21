import java.util.*;

public class PreviousSmaller {
    public static List<Integer> returnPreviousSmaller(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                result.add(-1);
            } else {
                result.add(st.peek());
            }

            st.push(arr[i]);
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

        List<Integer> result = returnPreviousSmaller(arr);
        System.out.println("Previous Smaller Element of every element is: " + result);

        sc.close();
    }
}
