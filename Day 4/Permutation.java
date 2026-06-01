import java.util.*;

public class Permutation {

    static HashSet<String> set = new HashSet<>();

    static void permute(String str, String ans) {
        if (str.length() == 0) {
            if (!set.contains(ans)) {
                System.out.println(ans);
                set.add(ans);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1);
            permute(rem, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        permute(str, "");
    }
}


