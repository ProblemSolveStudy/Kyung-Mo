package chap06;

import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) { // 2번째 배열요소부터 시작해야 하므로 i = 1
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j - 1] > tmp; j--) { // a[0] > a[i] 이라면 삽입이 필요함
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        System.out.println();

        insertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i=0; i< nx; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}



