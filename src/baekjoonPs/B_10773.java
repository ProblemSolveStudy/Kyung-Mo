package baekjoonPs;

import java.util.Scanner;
import java.util.Stack;

/***
 * 스택문제로 보임
 *
 * 장부 관리
 * 잘못된 수를 부를 때 마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 함
 * 모든 수를 받아 적은 후 그 수의 합을 구하라
 *
 * K개의 줄에서 정수가 1개씩 주어진다
 * 정수가 0이면 가장 최근에 쓴 수를 지운다.
 * 정수가 0이 아니면 해당 수를 쓴다
 * 정수가 0일 경우에 지울 수 있는 수가 있음을 보장 할 수 있다.
 */
public class B_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        int K = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                stack.pop();
            } else if (n != 0) {
                stack.push(n);
            }
        }

        while (stack.size() != 0) {
            result += stack.pop();
        }

        System.out.println(result);
    }
}
