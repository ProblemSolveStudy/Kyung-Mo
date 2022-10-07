package chap05;
/*
i = 열
j = 행
 */
public class QueenB {
    static int[] pos = new int[8]; // 각 열의 퀸의 위치


    // 각 열의 퀸 위치를 출력한다
    static void print() {
        for (int i=0; i<8; i++)
            System.out.printf("%2d", pos[i]);
        System.out.println();
    }

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            pos[i] = j; // 퀸을 j행에 배치함
            if (i==7) // 모든 열에 배치가 될경우
                print(); // 출력!
            else
                set(i + 1); // 아직 모든열에 배치가 되지 않은 경우엔 i의 값을 늘리자
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
