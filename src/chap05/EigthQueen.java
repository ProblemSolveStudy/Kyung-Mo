package chap05;

public class EigthQueen {
    static boolean[] flag_a = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[8]; // / 대각선 방향으로 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[8]; // \ 대각선 방향으로 퀸을 배치했는지 체크
    static int[] pos = new int[8];

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("2d%", pos[i]);
        }
        System.out.println();
    }

    static void set(int i) {
        for (int j = 0; i < 8; j++) {
            if (flag_a[j] == false && // 행,열,대각선 모든 조건이 false일 경우
                    flag_b[i + j] == false && // '/' 대각선은 i+j로 구할 수 있음
                    flag_c[i - j + 7] == false) { // '\' 대각선은 i-j+7로 구할 수 있음
                pos[i] = j; // 퀸을 배치한다
                if (i==7)
                    print();
                else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j +7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j +7] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
