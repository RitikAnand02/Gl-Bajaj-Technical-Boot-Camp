import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (0, 1, 2):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {

                mid++;

            } else {

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
