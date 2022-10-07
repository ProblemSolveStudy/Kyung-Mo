package chap01;

import java.util.Scanner;

public class Practice_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("a : ");
        a = sc.nextInt();

        while(true) {
            System.out.print("b : ");
            b = sc.nextInt();
            if(b>a) break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        int minus = b-a;

        System.out.println(minus);
    }
}
