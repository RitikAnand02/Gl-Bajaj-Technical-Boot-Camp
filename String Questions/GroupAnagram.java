import java.util.Arrays;
import java.util.Scanner;

public class GroupAnagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of strings:");
        int n = sc.nextInt();

        String[] arr = new String[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {

            if (visited[i])
                continue;

            System.out.print("[" + arr[i] + " ");
            visited[i] = true;

            for (int j = i + 1; j < n; j++) {

                if (isAnagram(arr[i], arr[j])) {
                    System.out.print(arr[j] + " ");
                    visited[j] = true;
                }
            }

            System.out.println("]");
        }
    }

    static boolean isAnagram(String s1, String s2) {

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}