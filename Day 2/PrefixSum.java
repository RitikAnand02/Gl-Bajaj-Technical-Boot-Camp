import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        prefix[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        int l = sc.nextInt();
        int r = sc.nextInt();

        int sum = prefix[r] - prefix[l - 1];

        System.out.println(sum);
    }
}
