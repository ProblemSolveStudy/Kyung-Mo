package chap08;

import java.util.HashMap;
import java.util.Map;

public class d {
    public static void main(String[] args) {
        int a = 1_000_000;

        int[] count = calc(a);

        for (int data : count) {
            System.out.print(data + " ");
        }
    }

    public static int[] calc(int money) {
        int[] exchange = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] count = new int[exchange.length];

        for (int i = 0; i < exchange.length; i++) {
            count[i] = money / exchange[i];
            money = money % exchange[i];
        }

        return count;
    }
}
