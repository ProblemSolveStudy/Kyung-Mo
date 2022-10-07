package chap03;

public class Practice_05 {
    static int binSearchX(int[] a, int n, int key) {
        int pl = 0; //검색범위 첫 인덱스
        int pr = n-1; //검색범위 마지막 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙값 인덱스
            if (a[pc] == key) {
                for (; pc > pl; pc--)
                    if (a[pc - 1] < key)
                        break;
                return pc; // 검색 성공
            } else if (a[pc] < key)
                pl = pc + 1;
            else  // (a[pc] > key)
                pr = pc - 1;
        } while (pl <= pr); // pl이 pr과 같아질때까지 해라!

        return -1; //검색 실패
    }

    public static void main(String[] args) {

    }
}
