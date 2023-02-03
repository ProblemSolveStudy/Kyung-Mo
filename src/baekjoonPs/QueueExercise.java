package baekjoonPs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 스택과는 다른 FIFO
 * 한쪽 끝은 front로 삭제 연산만 수행
 * 한쪽 끝은 rear로 삽입 연산만 수행
 * BFS에서 사용
 * 컴퓨터 버퍼에서 주로 사용함. (운영체제)
 */

public class QueueExercise {
    public static void main(String[] args) {
        /**
         * 자바에서 queue는 linkedlist를 활용해서 사용함
         */
        Queue<Integer> queue = new LinkedList<>();

        /**
         * 추가 메서드
         * add와 offer
         */

        queue.add(1);
        queue.offer(2);

        queue.remove();

        System.out.println(queue.peek());
        System.out.println(queue.size());

    }
}
