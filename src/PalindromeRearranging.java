import java.util.*;

public class PalindromeRearranging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }
            boolean oddFound = false;
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 == 1) {
                    if (oddFound) {
                        System.out.println("NO");
                        break;
                    }
                    oddFound = true;
                }
            }
            if (!oddFound) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
