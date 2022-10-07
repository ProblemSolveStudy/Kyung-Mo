package chap01;

import java.util.Scanner;

public class Practice_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("정숫값 : ");
            n = sc.nextInt();
        } while (n<=0);

        int no=0;
        while (n>0) {
            n /= 10;
            no++;
        }

        System.out.println(no);
    }
}
