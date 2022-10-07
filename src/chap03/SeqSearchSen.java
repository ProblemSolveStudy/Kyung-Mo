package chap03;
import java.util.Scanner;
//선형검색 보초법
public class SeqSearchSen {
    static int seqSearchSen(int[] a, int n, int key) { // a : 배열, n : 요솟수, key : 찾고자하는 값
        int i=0;

        a[n] = key;

        while (true) {
            if (a[i] == key)
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = sc.nextInt();
        int[] a = new int[n+1]; // 마지막에 보초를 세워야 하므로 n+1개의 요솟수

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearchSen(a, n, key); // 배열 a에서 키 값이 key인 요소를 검색해서 배열 a의 인덱스 반환

        if(idx == -1)
            System.out.println("검색 실패");
        else
            System.out.println(key + "는 a[" + idx + "]에 있습니다.");
    }
}
