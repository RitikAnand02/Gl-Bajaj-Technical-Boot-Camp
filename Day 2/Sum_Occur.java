import java.util.Scanner;

public class Sum_Occur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i <= max; i++) {
            if (count[i] > n / 4) {
                System.out.println(i);
                break;
            }
        }
    }
}
