package baekjoonPs;

import java.io.*;
import java.util.Stack;


/***
 * #괄호
 * 괄호의 모양이 올바르게 구성된 경우를 VPS라고 함
 * 한쌍의 괄호 기호로 된 문자열을 기본 VPS라고 함
 * 괄호가 올바르게 이어져 있어야만이 VPS임
 *
 * 주어진 VPS를 판별해서 YES or NO로 출력할 것
 *
 * # 풀이방법
 * 스택을 활용해서 "(" 값이 들어올 경우 push 하고
 * ")" 값이 들어올 경우 pop을 사용해서 스택 안에 있는 "(" 값을 빼줌
 * 결국 마지막에 스택이 비어있을 경우 YES, 비어있지 않다면 NO
 */

public class B_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            System.out.println(solve(br.readLine()));
        }
    }

    static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            } else if (c == ')') {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
