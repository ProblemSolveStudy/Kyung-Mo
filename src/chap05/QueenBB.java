package chap05;
/*
    i = 열
    j = 행
 */
public class QueenBB {
    static boolean[] flag = new boolean[8]; // 각 행에 퀸을 배치했는지 체크하는 flag
    static int[] pos = new int[8]; // 각 열의 퀸의 위치

    static void print() { // 각 열의 퀸의 위치를 출력함
        for (int i=0; i<8; i++)
            System.out.printf("2%d", pos[i]);
        System.out.println();
    }

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag[j] == false) { // 해당 행에 퀸이 없다면
                pos[i] = j; // 해당 행에 퀸을 배치함
                if (i==7) // 모든 열에 퀸이 배치가 됐다면
                    print(); // 출력!
                else { // 모든열에 배치가 되지 않았다면
                    flag[j] = true; // 해당 행은 flag를 true로 하고
                    set(i + 1); // 다음 열로 넘어가서
                    flag[j] = false; // 다음 열의 행을 false로 초기화후 for문 재실행
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
