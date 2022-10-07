package chap03;
import java.util.Scanner;
public class Practice_03 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {

        int index=0;    // key와 일치하는 요솟수
        for (int i = 0; i < n; i++) {
            if(a[i] == key)
                idx[index++] = i;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 9, 2, 9, 4, 6, 7, 9,};
        int[] idx = new int[8];
        int n = 8;
        int key = 9;

        System.out.println(searchIdx(a, n, key, idx));
        for (int data : idx) {
            System.out.println(data);
        }


    }
}
