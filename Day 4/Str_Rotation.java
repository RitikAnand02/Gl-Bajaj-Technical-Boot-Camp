import java.util.*;

public class Str_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int n = sc.nextInt();
        char dir = sc.next().charAt(0);

        int len = str.length();
        String rotate = "";

        if (dir == 'L') {
            rotate = str.substring(n) + str.substring(0, n);
        } else if (dir == 'R') {
            rotate = str.substring(len - n) + str.substring(0, len - n);
        }

        char[] arr = rotate.toCharArray();

        for (int i = 0; i < n && i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        System.out.println("Rotated String: " + new String(arr));
    }
}