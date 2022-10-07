package chap04;

public class Practice_07 {
    static class IntDeque {
        private int[] que;
        private int capacity;
        private int num;
        private int front;
        private int rear;

        public class EmptyIntDequeException extends RuntimeException {
            public EmptyIntDequeException() { }
        }


        public class OverflowIntDequeException extends RuntimeException {
            public OverflowIntDequeException() { }
        }

        public IntDeque(int max) {
            num = front = rear = 0;
            capacity = max;
            try {
                que = new int[capacity];
            } catch (OutOfMemoryError e) {
                capacity = 0;
            }
        }


    }
}
