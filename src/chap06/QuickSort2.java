package chap06;

import chap04.IntStack;

import static chap06.BubbleSort.swap;


public class QuickSort2 {
    static void quickSort(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right - left + 1);
        IntStack rstack = new IntStack(right - left + 1);

        lstack.push(left);
        lstack.push(right);

        while (lstack.isEmpty() != true) {
            int pl = left = lstack.pop(); // 왼쪽 커서
            int pr = right = rstack.pop(); // 오른쪽 커서
            int x = a[(left + right) / 2]; // 피벗

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);
            } while (pl <= pr);

            if (left < pr) {
                lstack.push(left);
                rstack.push(pr);
            }

            if (pl < right) {
                lstack.push(pl);
                rstack.push(right);
            }
        }
    }
}
