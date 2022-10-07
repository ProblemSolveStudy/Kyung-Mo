package chap04;

public class Practice_06 {
    static class Gqueue<E> {
        private int max;
        private int num;
        private int front;
        private int rear;
        private E[] que;


        public static class EmptyGQueueException extends RuntimeException {
            public EmptyGQueueException() {}
        }

        public static class OverflowGQueueException extends RuntimeException {
            public OverflowGQueueException() {}
        }

        public Gqueue(int capacity) {
            num = front = rear = 0;
            max = capacity;
            try {
                que = (E[]) new Object[max];
            } catch (OutOfMemoryError error) {
                max = 0;
            }
        }

        public E enque(E x) throws OverflowGQueueException {
            if (num >= max)
                throw new OverflowGQueueException();
            que[rear++] = x;
            num++;
            if (rear == max)
                rear = 0;
            return x;
        }

        public E deque() throws EmptyGQueueException {
            if (num <= 0)
                throw new EmptyGQueueException();
            E x = que[front++];
            num--;
            if (front == max)
                front = 0;
            return x;
        }
    }


}
