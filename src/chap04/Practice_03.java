package chap04;

public class Practice_03 {
    static class DoubleHeadIntStack {
        private int capacity;
        private int ptrA;
        private int ptrB;
        private int[] stk;

        public enum AorB {StackA, StackB};

        public class EmptyDoubleHeadIntStackException extends RuntimeException {
            public EmptyDoubleHeadIntStackException() { }
        }

        //--- 실행 시 예외 : 스택이 가득 참 ---//
        public class OverflowDoubleHeadIntStackException extends RuntimeException {
            public OverflowDoubleHeadIntStackException() { }
        }

        public DoubleHeadIntStack(int max) {
            ptrA = 0;
            ptrB = max-1;
            capacity = max;
            try {
                stk = new int[capacity];
            } catch (OutOfMemoryError error) {
                max = 0;
            }
        }

        public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException {
            if (ptrA >= ptrB + 1)
                throw new OverflowDoubleHeadIntStackException();
            switch (sw) {
                case StackA: stk[ptrA++] = x; break;
                case StackB: stk[ptrB--] = x; break;
            }
            return x;
        }

        public int pop(AorB sw) throws EmptyDoubleHeadIntStackException {
            int x=0;
            switch (sw) {
                case StackA:
                    if (ptrA<=0)
                        throw new EmptyDoubleHeadIntStackException();
                    x = stk[--ptrA];
                case StackB:
                    if (ptrB>=capacity - 1)
                        throw new EmptyDoubleHeadIntStackException();
                    x = stk[++ptrB];
                    break;
            }
            return x;
        }

        public int peek(AorB sw) throws EmptyDoubleHeadIntStackException {
            int x=0;
            switch (sw) {
                case StackA:
                    if (ptrA<=0)
                        throw new EmptyDoubleHeadIntStackException();
                    x = stk[ptrA - 1];
                case StackB:
                    if (ptrB>=capacity - 1)
                        throw new EmptyDoubleHeadIntStackException();
                    x = stk[ptrB + 1];
                    break;
            }
            return x;
        }

        public int indexOf(AorB sw, int x) {
            switch (sw) {
                case StackA:
                    for (int i = ptrA - 1; i >= 0; i--) {
                        if(stk[i] == x)
                            return i;
                    break;
                    }
                case StackB:
                    for (int i = ptrB+1 ; i<=capacity; i++)
                        if(stk[i] == x)
                            return i;
                    break;
            }
            return -1;
        }

    }
}
