package baekjoonPs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/***
 * 후위 표기식 2
 *
 * 첫째 줄에 피연산자 개수 N이 주어진다
 * 둘째줄에는 후위 표기식이 주어진다.
 * 세번째 줄부터는 각각 피연산자에 대응하는 값이 주어진다.
 * 후위 표기식을 계산하라.
 *
 * 예제
 * ABC*+DE/-
 * 1. (A+(B*C))-(D/E)
 * 2. (A+(BC*))-(DE/)
 * 3. ABC*+DE/-
 *
 * 풀이 방법
 * 문자가 입력되면 문자에 해당하는 값을 스택에 넣어주고
 * 연산자가 입력되면 스택에 있는 값 두개를 빼서 연산자로 연산을 진행한다.
 */

public class B_1935 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 피연산자의 개수

        String data = br.readLine(); // 후위 표기식

        double[] arr = new double[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(br.readLine()); // 대응될 숫자들
        }

        Stack<Double> stack = new Stack<>();

        double result = 0;
        for (int i = 0; i < data.length(); i++) {
            if ('A' <= data.charAt(i) && data.charAt(i) <= 'Z') {
                // 대문자 A의 아스키 코드는 65
                stack.push(arr[data.charAt(i) - 'A']);
            } else {
                if (!stack.empty()) {
                    double first = stack.pop();
                    double second = stack.pop();
                    // 문자열이 아닐 경우 (*+/-)

                    switch (data.charAt(i)) {
                        case '+':
                            result = second + first;
                            stack.push(result);
                            continue;

                        case '-':
                            result = second - first;
                            stack.push(result);
                            continue;

                        case '*':
                            result = second * first;
                            stack.push(result);
                            continue;

                        case '/':
                            result = second / first;
                            stack.push(result);
                            continue;
                    }
                }
            }
        }

        System.out.printf("%.2f", stack.pop());

        br.close();
    }
}
