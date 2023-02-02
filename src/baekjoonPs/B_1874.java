package baekjoonPs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택 수열
 *
 * 1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓는 것으로 하나의 수열을 만들 수 있다.
 * push하는 순서는 오름차순을 지켜야 한다.
 * 수열을 만들 수 있는지 없는지, 만들 수 있다면 push와 pop 연산을 어떤 순서로 수행해야 하는지 알아낼 수 있다.
 *
 * 첫줄에 n이 주어진다
 * 두번째 줄의 n개의 수가 주어지며 같은 정수가 두번나오진 않는다.
 *
 * ## 풀이 과정
 * 1. 가장 큰수 순서대로 들어가야만 한다.
 * 2. 스택하나에 리스트 하나?
 * 3. push할때 오름차순을 지켜야 한다.
 */


public class B_1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int start = 0;

        while (N-- > 0) {

            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }

                start = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            // value 값이 들어오면 그 값을 꺼내기 위함!
            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}
