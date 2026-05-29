import java.util.Scanner;

public class Change_Space_To_UnderScore {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                ch = '_';
            }
            System.out.print(ch);
        }
        
    }
}
