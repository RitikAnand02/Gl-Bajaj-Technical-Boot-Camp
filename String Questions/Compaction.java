import java.util.Scanner;

public class Compaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String result = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i < str.length() - 1 && ch == str.charAt(i + 1)) {
                count++;
            } else {
                result = result + ch + count;
                count = 1;
            }
        }
        System.out.println("Compacted string: " + result);

    }
}
