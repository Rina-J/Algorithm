import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
           자연수 M, N
            ㄴ M이상 N이하의 자연수 중 소수 모음의 합과 소수중 최솟값 출력
            M이상 N이하의 자연수 중 소수가 없을 경우, -1 출력
            60 <=   {...}   >= 100
            620 61
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        br.close();

        int min = N;
        int sum = 0;
        int cnt = 0;

        for (int i = M; i <= N; i++) {

            if (i == 1) {
                cnt++;
            }

            for (int j = 2; j < i; j++) { // 1소수가 아니기 때문에 j=2부터 시작
                if (i % j == 0) { // i % j의 값이 0이면 약수가 1개 이상 있는것
                    cnt++;
                }
            }

            if (cnt == 0) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
            cnt = 0;
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}