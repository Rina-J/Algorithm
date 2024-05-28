import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
           정수 N -> 소인수분해하는 프로그램
           N (1 ≤ N ≤ 10,000,000)
           ㄴ N이 1인 경우 아무것도 출력하지 않음
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        br.close();

        int i = 2;

        // n이 1이 될 때까지 반복
        while (N != 1) {
            // i가 n의 약수이면 나누고 출력
            if (N % i == 0) {
                N /= i;
                sb.append(i + "\n");
            } else {
                i++;
            }
        }
        System.out.print(sb);
    }
}