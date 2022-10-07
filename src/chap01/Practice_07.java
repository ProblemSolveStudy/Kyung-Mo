package chap01;

import java.util.Scanner;

public class Practice_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=0;
        int i=1;
        for(; i<=n; i++){
            sum += i;
            System.out.print(i + " + ");
            if (i == n) {
                System.out.print(" = ");
            }
        }

        System.out.println(sum);
    }
}
