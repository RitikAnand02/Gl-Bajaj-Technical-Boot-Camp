import java.util.Scanner;

public class Mat_Dig_Diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int leftDigSum = 0;
        int rightDigSum = 0;
        for (int i = 0; i < n; i++) {
            leftDigSum += arr[i][i];
            rightDigSum += arr[i][n - 1 - i];
        }
        System.out.println("difference of diagonals: " + (leftDigSum - rightDigSum));
    }
}
