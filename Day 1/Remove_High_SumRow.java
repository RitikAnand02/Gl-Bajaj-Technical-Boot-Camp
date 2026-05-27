import java.util.Scanner;

public class Remove_High_SumRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int index = 0;

        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }

        for (int i = 0; i < r; i++) {
            if (i == index) {
                continue;
            }
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
