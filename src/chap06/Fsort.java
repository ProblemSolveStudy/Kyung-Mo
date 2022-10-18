package chap06;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Fsort {
    static void fSort(int[] a, int n, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[n];

        for(int i=0;    i<n;     i++) f[a[i]]++; // 도수분포표 만들기
        for(int i=1;    i<= max; i++) f[i] += f[i-1]; // 누적 도수분포표 만들기
        for(int i=n-1;  i>=0;    i--) b[--f[a[i]]] = a[i]; // 목적배열 만들기
        for(int i=0;    i<n;     i++) a[i] = b[i]; // 배열 복사
    }

    public static void main(String[] args) {
        System.out.println("도수정렬");
        System.out.println("요솟수 : 7");
        int[] x = {22, 5, 11, 32, 120, 68, 70};

        int max = x[0];
        for (int i=1; i<7; i++)
            if (x[i] > max) max = x[i];

        fSort(x, 7, max);

        for(int i=0; i<7; i++)
            System.out.println("x["+i+"] = " + x[i]);
    }
}
