import java.util.Arrays;
import java.util.Scanner;

public class Freq_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int freq = 1;
        System.out.println("Element Frequency");

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                System.out.println(arr[i - 1] + " -> " + freq);
                freq = 1;
            }
        }

        System.out.println(arr[n - 1] + " -> " + freq);
    }
}