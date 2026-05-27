import java.util.*;

public class Diff_First_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int diff = 0;
        for (int i = 0; i < n; i++) {
            diff = arr[0] - arr[n - 1];
        }

        System.out.println(diff);
    }
}