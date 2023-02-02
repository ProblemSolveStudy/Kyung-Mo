package Eratosthenes;

public class PrimeNumberSeieve {
    public static void main(String[] args) {
        primeNumberSieve();
    }

    /***
     * 소수가 아닌 숫자들은 0으로 변환
     */

    static void primeNumberSieve() {
        int[] a = new int[1001];
        int number = 1000;

        for (int i = 2; i <= number; i++) {
            a[i] = i;
        }

        for (int i = 2; i <= number; i++) {
            if(a[i] == 0) continue;
            for (int j = i + i; j <= number; j += i) {
                a[j] = 0;
            }
        }

        for (int i = 2; i <= number; i++) {
            if(a[i] != 0) System.out.println(a[i]);
        }
    }
}
