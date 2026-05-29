import java.util.Scanner;
import java.util.Stack;

public class Valid_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.isEmpty()) {
                    System.out.println("Invalid ");
                    return;
                }
                char top = s.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    System.out.println("Invalid");
                    return;
                }

            }
        }
        if (s.isEmpty()) {
            System.out.println("Valid ");
        } else {
            System.out.println("Invalid ");
        }
    }
}
