import java.util.*;

public class Trapping {
    public static int trappingRainwater(int[] arr) {
        int result = 0;
        

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

        int result = trappingRainwater(arr);
        System.out.println("Trapped Rainwater is: " + result);

        sc.close();
    }
}
