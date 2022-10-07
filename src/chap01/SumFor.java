package chap01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 N까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        int sum=0;
        int i=1;
        for(i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(i);

        System.out.println(sum);

    }
}
