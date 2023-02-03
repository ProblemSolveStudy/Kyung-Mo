package baekjoonPs;

import java.io.*;

public class BufferedReaderExercise {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write(s);
        bw.flush();
        
        // 잔디 테스트

    }
}
