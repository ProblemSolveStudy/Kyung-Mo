package chap03;
import java.util.Scanner;

// pc : 중앙값 (0 + n-1)/2
public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0; //검색범위 첫 인덱스
        int pr = n-1; //검색범위 마지막 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙값 인덱스
            if (a[pc] == key)
                return pc; // 검색 성공
            else if (a[pc] < key)
                pl = pc + 1;
            else  // (a[pc] > key)
                pr = pc - 1;
        } while (pl <= pr); // pl이 pr과 같아질때까지 해라!

        return -1; //검색 실패
    }

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

        int idx = binSearch(a, n, key); // idx = pc
        if(idx == -1)
            System.out.println("해당 요소값이 없습니다.");
        else
            System.out.println(key + "는 a["+idx+"]에 있습니다.");
    }
}
