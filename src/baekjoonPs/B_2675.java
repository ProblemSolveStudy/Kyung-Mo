package baekjoonPs;

import java.util.Scanner;

public class B_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String alp = sc.next();

            for (int j = 0; j < alp.length(); j++) {
                for (int l = 0; l < R; l++) {
                    System.out.print(alp.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
