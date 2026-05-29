import java.util.Scanner;

public class MinWindow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String p = sc.nextLine();

        int[] freq = new int[256];

        for (char c : p.toCharArray())
            freq[c]++;

        int left = 0, count = 0, start = 0, min = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (freq[ch] > 0)
                count++;

            freq[ch]--;

            while (count == p.length()) {

                if (right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);

                freq[lc]++;

                if (freq[lc] > 0)
                    count--;

                left++;
            }
        }

        if (min == Integer.MAX_VALUE)
            System.out.println("No window found");
        else
            System.out.println(s.substring(start, start + min));
    }
}