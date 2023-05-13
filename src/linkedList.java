import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> a = new LinkedList<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(i + 1);
        }
        System.out.println(a);
    }
}
