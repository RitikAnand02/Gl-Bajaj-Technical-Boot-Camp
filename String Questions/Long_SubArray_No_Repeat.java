import java.util.Scanner;

public class Long_SubArray_No_Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (temp.indexOf(ch) == -1) {
                    temp += ch;
                } else {
                    break;
                }
            }
            if (temp.length() > max) {
                max = temp.length();
            }
        }
        System.out.println("longest substring without repeating characters: " + max);

    }
}
