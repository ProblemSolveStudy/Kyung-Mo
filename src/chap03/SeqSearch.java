package chap03;
import java.util.Scanner;
public class SeqSearch {
    static int seqSearch(int[] a, int n, int key) { // a : 배열, n : 요솟수, key : 찾고자하는 값
        int i=0;

        while (true) {
            if (i == n) // 검색실패
                return -1;
            if (a[i] == key) // 검색성공
                return i;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearch(a, n, key); // 배열 a에서 키 값이 key인 요소를 검색해서 배열 a의 인덱스 반환

        if(idx == -1)
            System.out.println("검색 실패");
        else
            System.out.println(key + "는 a[" + idx + "]에 있습니다.");
    }
}
