import java.util.*;

public class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public void push(int data) {
        if (minSt.isEmpty()) {
            minSt.push(data);
        } else if (!minSt.isEmpty() && data < minSt.peek()) {
            minSt.push(data);
        }
        st.push(data);
    }

    public void pop() {
        if (st.peek() == minSt.peek()) {
            minSt.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack obj = new MinStack();
        boolean run = true;
        while (run) {
            System.out
                    .println("****************** Min Stack Implementation ******************");
            System.out.println("1. Push the data");
            System.out.println("2. Pop the data");
            System.out.println("3. View top data");
            System.out.println("4. Get min value");
            System.out.println("5. Exit");
            System.out.println("Enter any valid input");
            int val = sc.nextInt();
            switch (val) {
                case 1:
                    System.out.println("Enter the value to be pushed: ");
                    int data = sc.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    obj.pop();
                    break;

                case 3:
                    System.out.println("The top value is: " + obj.top());
                    break;

                case 4:
                    System.out.println("The Min Value is: " + obj.getMin());
                    break;

                case 5:
                    run = false;
                    break;
            }
        }
        sc.close();
    }
}
