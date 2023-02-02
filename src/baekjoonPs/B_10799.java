package baekjoonPs;

import java.io.*;
import java.util.Stack;

public class B_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Stack<Character> stack = new Stack<>();

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == ')') {
                stack.pop();

                if (s.charAt(i - 1) == '(') {
                    result += stack.size();
                } else {
                    result++;
                }
            }
        }
        bw.write(result + "\n");
        bw.flush();
    }
}
