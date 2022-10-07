package chap05;

public class Practice_04 {
    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.print(n + " ");
            recur2(n - 1);
        }
    }

    public static void main(String[] args) {
        recur2(4);
    }
}
