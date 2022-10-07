package chap04;

public class Practice_02 {
    static class Gstack<E> {
        private int max;
        private int ptr;
        private E[] stk;

        public static class EmptyGStackException extends RuntimeException{
            public EmptyGStackException() {}
        }

        public static class OverflowGStackException extends RuntimeException {
            public OverflowGStackException() {}
        }

        public Gstack(int capacity) {
            ptr = 0;
            max = capacity;
            try {
                stk = (E[]) new Object[max];
            } catch (OutOfMemoryError e) {
                max = 0;
            }
        }

        public E push(E x) throws OverflowGStackException {
            if (ptr == max) {
                throw new OverflowGStackException();
            }
            return stk[ptr++] = x;
        }

        public E peek() throws EmptyGStackException {
            if (ptr <= 0)
                throw new EmptyGStackException();
            return stk[ptr - 1];
        }

        public int indexOf(E x) {
            for (int i = ptr - 1; i >= 0; i--)
                if (stk[i] == x)
                    return i;
            return -1;
        }

        public void dump() {
            if(ptr<=0)
                System.out.println("스택이 비어 있습니다.");
            else {
                for (int i=0; i<ptr; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
