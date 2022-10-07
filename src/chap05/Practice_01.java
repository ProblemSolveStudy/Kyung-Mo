package chap05;

import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mul=1;

        for (int i = 0; i < n; i++) {
             mul *= n-i;
            if (n == 0) {
                mul = 1;
            }
        }

        System.out.println(mul);
    }
}
