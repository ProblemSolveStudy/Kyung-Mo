package chap06;

import java.util.Scanner;

public class ShellSort {
    //셸 정렬
    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2) { // h는 증분값
            for (int i = h; i < n; i++) { // 배열의 앞 요소로부터 h만큼 떨어진 부분의 인덱스 for문
                int j;
                int tmp = a[i]; // 뒤의 값 저장
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j+h] = a[j];
                }
                a[j+h] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("셸 정렬(버전1)");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        shellSort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
