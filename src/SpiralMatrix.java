import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int count = 1;
        while (count <= n * n) {
            for (int i = l; i <= r; i++) {
                a[t][i] = count++;
            }
            ++t;
            for (int i = t; i <= b; i++) {
                a[i][r] = count++;
            }
            --r;
            for (int i = r; i >= l; i--) {
                a[b][i] = count++;
            }
            --b;
            for (int i = b; i >= t; i--) {
                a[i][l] = count++;
            }
            ++l;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
