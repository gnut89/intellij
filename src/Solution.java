import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int ans = -1, time = 0;
            for (int i = 0; i < n - 1; i++) {
                if (time != t) {
                    if (b[i] < b[i + 1]) {
                        time++;
                        ans = i + 1;
                    } else {
                        ans = i;
                        time += a[i];
                    }
                }
            }
            System.out.println(ans + 1);
        }
    }
}