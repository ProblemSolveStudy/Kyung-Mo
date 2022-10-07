package chap05;

public class Practice_02 {
    public static void main(String[] args) {
        gcd(60, 48);
    }
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
