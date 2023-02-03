package baekjoonPs;

import java.util.Scanner;

/***
 * push X : 정수 X를 스택에 넣는 연산
 * pop 스택에서 가장 위에 있는 정수를 뺌
 * size : 스택 정수 개수 출력
 * empty : 스택 비어있으면 1, 아니면 0
 * top : 스택의 가장 위에 있는 정수를 출력함. 만약 스택에 들어가있는 정수가 없으면 -1 출력
 */

// 커밋 테스트

public class B_10828 {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        stack = new int[N];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            switch (str) {
                case "push":
                    push(sc.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append("\n");
                    break;

                case "size":
                    sb.append(size()).append("\n");
                    break;

                case "empty":
                    sb.append(empty()).append("\n");
                    break;

                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }

        System.out.println(sb);

    }

    public static void push(int i) {
        stack[size] = i;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int res = stack[size - 1];
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }
}

