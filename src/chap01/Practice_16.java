package chap01;

public class Practice_16 {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {					// i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= n - i; j++)			// n - i 개의 ' ' 을 출력
                System.out.print(' ');
            for (int j = 1; j <= (i-1)*2+1; j++)	// (i - 1) * 2 + 1 개의 '*' 을 출력
                System.out.print(i);
            System.out.println();									// 줄바꿈
        }
    }

    public static void main(String[] args) {
        spira(4);
    }
}
