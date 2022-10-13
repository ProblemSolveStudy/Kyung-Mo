package chap06;

import java.util.Scanner;

public class MergeArray {

    static void merge(int[] a, int na, int[] b, int nb, int[] c) {
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while (pa < na && pb < nb) { // pa pb 비교해서 pa가 작으면 pa값을 pc에 저장 or pb가 작으면 pb값을 pc에 저장
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
        }

        while (pa < na) { //
            c[pc++] = a[pa++];
        }

        while (pb < nb) { // 어차피 정렬된 배열이기 때문에 그냥 복붙조져버리는 것
            c[pc++] = b[pb++];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 11, 13};
        int[] b = {1, 2, 3, 4, 9, 16, 21};
        int[] c = new int[a.length + b.length];

        merge(a, a.length, b, b.length, c);
    }
}
