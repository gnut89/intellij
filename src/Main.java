import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = 0;
            int idx = 0;
            while (k-- > 0) {
                ans += a[n - 1 - idx];
                idx++;
            }
            int cnt = 0;
            int j = n - 1 - idx;
            while (cnt < n - 2*k && j >= 0) {
                cnt += (j+1);
                j--;
            }
            cnt -= (j+1);
            int left = n - k - cnt;
            for (int i = n - 1; i >= j + 1; i--) {
                if (n - i <= left) {
                    ans += a[i];
                }
            }
            System.out.println(ans);
        }
    }
}
