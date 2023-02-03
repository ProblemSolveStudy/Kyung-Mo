package baekjoonPs;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 자료구조 사용
 * 맨 오른쪽부터 비교 시작
 * int N 탑의 수
 * int index 탑의 번호 == stack.size()
 *
 * 스택이 비어있을 경우 0을 출력하고, 현재 수를 다음 비교를 위해 높이스택에 넣어준다. (첫번째 값이거나, 현재까지 가장 큰 수)
 *
 * 스택이 비어있지 않을경우
 *
 * 1)  현재 값이 stack의 top보다 낮을때 : 무조건 top에 수신하게 되므로, top의 인덱스를 출력한다.
 *
 *                                                  또한, 뒤에 자신보다 낮은 탑이오면 자신을 먼저 만나게되므로 스택에 push한다
 *
 * 2)  현재 값이 stack의 top보다 높을때 : stack 아래 자신보다 낮은 값이 있어봤자 도달할 수 없으므로 stack의 top 삭제
 *
 *                                                  stack의 모든 값과 비교 -> 자기보다 큰 값 만나면 1)수행 , 스택 비면 2)수행
 *
 *                                                  이때문에 while(true)로 구현
 *
 * 첫번째 원소와 가장 높은 탑의 경우 0을 출력한다.
 */

public class B_2493 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<int[]> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()) {
                if (stack.peek()[1] < current) {
                    stack.pop();
                } else {
                    System.out.print(stack.peek()[0] + " ");
                    break;
                }
            }

            if (stack.isEmpty()) {
                System.out.print("0 ");
            }
            stack.push(new int[]{i, current});
        }
    }
}
