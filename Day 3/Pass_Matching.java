import java.util.Scanner;

public class Pass_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        System.out.print("Re-enter password: ");
        String rePass = sc.nextLine();
        if (pass.equals(rePass)) {
            for (int i = 0; i < pass.length(); i++) {
                System.out.print("#");
            }
        } else {
            System.out.println("Password not matched.");
        }
    }
}
