import java.util.*;

public class Str_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String curr = "";
        int num = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(num);
                strStack.push(curr);
                num = 0;
                curr = "";
            } else if (ch == ']') {
                int repeat = numStack.pop();
                String prev = strStack.pop();

                String temp = "";
                for (int i = 0; i < repeat; i++) {
                    temp += curr;
                }

                curr = prev + temp;
            } else {
                curr += ch;
            }
        }

        System.out.println(curr);
    }
}