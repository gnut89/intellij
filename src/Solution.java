import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            boolean check = false;
            for (int x = 0; x < 2; x++) {
                if (n - x * k >= 0 && (n - x * k) % 2 == 0) {
                    System.out.println("YES");
                    check = true;
                    break;
                }
            }
            if (check == false) {
                System.out.println("NO");
            }
            t--;
        }
    }
}