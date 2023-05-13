import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        int[] b = new int[1001];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (b[a[i]] == 0) {
                q.add(a[i]);
                ++count;
            }
            if (count == k) {
                q.remove();
                --count;
            }
        }
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
