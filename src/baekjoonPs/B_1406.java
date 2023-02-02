package baekjoonPs;


import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

/***
 * 에디터 구현
 *
 * 소문자만 기록할 수 있는 편집기
 * 최대 60만글자
 * 길이가 L인 문자열이 편집기에 입력이 되어 있으면 커서가 있을 수 있는 곳은 L+1곳
 * L : 커서를 왼쪽으로 한칸 옮김 (커서가 문장의 맨 앞이면 무시)
 * D : 커서를 오른쪽으로 한칸 옮김 (커서가 문장의 맨 뒤면 무시)
 * B : 커서 왼쪽의 문자 삭제함 (커서가 맨 앞이면 무시)
 *     삭제로 인해 커서는 한칸 왼쪽 이동한 것 처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
 * P $ : $라는 문자를 커서 왼쪽에 추가함
 *
 *
 * 첫번째 줄에 문자열 주어짐, 문자열의 길이 N, 소문자만 가능 (N<100,000)
 * 둘째 줄 입력할 명령어의 개수 M
 * 순서대로 명령어 입력
 *
 * ##풀이과정
 * 커서의 위치는 현재 n번째 문자의 오른쪽인 n+1에 위치해야 함
 * 커서를 index로 사용하지 않고 Iterator 객체를 사용해서 쓰도록 할 것.
 */
public class B_1406 {
    static LinkedList<Character> ll = new LinkedList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());


        for (int i = 0; i < str.length(); i++) {
            ll.add(str.charAt(i));
        }

        ListIterator<Character> iterator = ll.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case 'L':
                    if(iterator.hasPrevious()) iterator.previous();
                    break;

                case 'D':
                    if(iterator.hasNext()) iterator.next();
                    break;

                case 'B':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;

                case 'P':
                    iterator.add(command.charAt(2));
                    break;
            }
        }

        for (char c : ll) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}
