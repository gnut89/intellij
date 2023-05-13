import java.util.Scanner;

public class fdsfasfsda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int Mishka = 0, Chris = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                ++Mishka;
            }
            if (b[i] > a[i]) {
                ++Chris;
            }
        }
        if (Mishka > Chris) {
            System.out.println("Mishka");
            return;
        }
        if (Chris > Mishka) {
            System.out.println("Chris");
            return;
        } else {
            System.out.println("Friendship is magic!^^");
            return;
        }
    }
}
