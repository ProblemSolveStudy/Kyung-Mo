package baekjoonPs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            int down = queue.poll();
            queue.offer(down);
        }

        System.out.println(queue.peek());


    }
}
