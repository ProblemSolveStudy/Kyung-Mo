package chap01;
import java.util.Scanner;
public class Practice_03 {

    static int min4(int a, int b, int c, int d) {
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("a : "); a = sc.nextInt();
        System.out.println("b : "); b = sc.nextInt();
        System.out.println("c : "); c = sc.nextInt();
        System.out.println("d : "); d = sc.nextInt();

        int min = min4(a, b, c, d);

        System.out.println("min value : " + min);
    }
}
