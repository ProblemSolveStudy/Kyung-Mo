package chap02;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter=0; // 나눗셈 횟수

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) {   //  나누어떨어질 경우
                    break;  //  소수가 아님
                }
            }
            if(n==i)    //  마지막까지 나누어 떨어지지 않은 수를 출력함
                System.out.println(n);
        }
        System.out.println("나눗셈을 시행한 횟수 : " + counter);
    }
}
