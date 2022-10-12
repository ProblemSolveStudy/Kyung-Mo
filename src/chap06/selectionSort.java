package chap06;

import static chap06.BubbleSort.swap;

public class selectionSort {
    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min])
                    min = j;
                swap(a, i, min);
            }
        }
    }
}