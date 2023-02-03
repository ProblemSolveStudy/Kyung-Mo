package baekjoonPs;

import java.io.*;
import java.util.Stack;

public class B_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(br.readLine());

        Stack<Character> stack = new Stack<>();

        int result = 0;

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (c == '(') {
                stack.push(c);
                continue;
            }

            if (c == ')' && sb.charAt(i-1) == '(') {
                stack.pop();
                result += stack.size();
            } else if (c == ')' && sb.charAt(i-1) == ')') {
                stack.pop();
                result++;
            }
        }

        bw.write(result);
        bw.flush();
    }
}
