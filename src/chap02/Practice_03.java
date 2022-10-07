package chap02;
import java.util.*;
public class Practice_03 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void reverse(int[] a) {
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]을 교환합니다.");
            swap(a, i, a.length - i - 1);
            System.out.println(Arrays.toString(a));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순을 정리했습니다.");
        for (int i = 0; i < num; i++) {
            System.out.println("x["+i+"] = " + x[i]);
        }

        System.out.println(sumOf(x));
    }

    static int sumOf(int[] a) {
        int sum=0;

        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }

        return sum;
    }
}
