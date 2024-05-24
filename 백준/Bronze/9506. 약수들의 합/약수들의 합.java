import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            완전수(n = 자신을 제외한 모든 약수들의 합)
            6 = 1 + 2 + 3
            입력의 마지막엔 -1 주어짐
            n != 완전수 => n is NOT perfect. 출력
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            sb.append(n + " = 1");

            int sum = 1;

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    sb.append(" + " + i);
                    sum += i;
                }

            }

            if (n == sum) {
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        br.close();

    }
}