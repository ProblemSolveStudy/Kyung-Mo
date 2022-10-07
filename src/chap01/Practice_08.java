package chap01;

import java.util.Scanner;

public class Practice_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = (n+1) * (n/2) + (n % 2 == 1 ? (n+1) / 2 : 0) ; // + 원리가 뭔지 모르겠다

        System.out.println(sum);
    }
}
