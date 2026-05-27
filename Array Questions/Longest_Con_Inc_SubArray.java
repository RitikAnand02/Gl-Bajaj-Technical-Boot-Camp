import java.util.Scanner;

public class Longest_Con_Inc_SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLen = 1;
        int currentLen = 1;

        int endIndex = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                currentLen++;
            } else {
                currentLen = 1;
            }

            if (currentLen > maxLen) {
                maxLen = currentLen;
                endIndex = i;
            }
        }

        System.out.println("Length = " + maxLen);

        System.out.print("Subarray = ");

        for (int i = endIndex - maxLen + 1; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
