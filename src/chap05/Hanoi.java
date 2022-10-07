package chap05;

import java.util.Scanner;

public class Hanoi {

    static String[] name = {"A", "B", "C"};

    static void move(int n, int x, int y) {



        if(n>1) // n-1의 값이 0이 될수는 없기 때문
            move(n-1, x, 6-x-y);

        System.out.println("원판["+n+"]을 " + x + "기둥에서 " + y + "기둥으로 옮겼습니다,");

        if(n>1)
            move(n - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        move(3, 1, 3);
    }
}
