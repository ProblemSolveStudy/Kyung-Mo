package chap02;
import java.util.Arrays;
import java.util.Scanner;
public class Practice_04_05 {

    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println(Arrays.toString(b));
    }

    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }

        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 a의 요솟수 : ");
        int na = sc.nextInt();

        int[] a = new int[na];
        int[] b = new int[na];

        for (int i = 0; i < na; i++) {
            System.out.println("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        rcopy(a, b);
    }
}
