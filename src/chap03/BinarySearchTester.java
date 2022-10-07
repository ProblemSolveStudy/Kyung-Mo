package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = sc.nextInt(); // 요솟수
        int[] a = new int[n];

        System.out.println("오름차순으로 입력하세요.");
        System.out.print("a[0] : ");  //첫 요소 입력 (오름차순 정렬이기 때문에 초기값만 지정해줌)
        a[0] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            do {
                System.out.print("a[" + i + "] : ");
                a[i] = sc.nextInt();
            } while (a[i] < a[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(a, key);
        if (idx < 0) {
            int insPoint = -idx - 1;
            System.out.println("삽입 포인트는 " + insPoint + "입니다.");

        } else
            System.out.println(key + "는 a["+idx+"]에 있습니다.");
    }
}
