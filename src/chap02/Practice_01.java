package chap02;
import javax.sound.sampled.EnumControl;
import java.util.*;
public class Practice_01 {
    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Random rd = new Random();

        int num = rd.nextInt(9) + 1;
        System.out.println("People's count : " + num);

        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            int height_ = 100 + rd.nextInt(90);
            height[i] = height_;
            System.out.println(height[i]);
        }

        System.out.println("max value = " + maxOf(height));




    }

}
