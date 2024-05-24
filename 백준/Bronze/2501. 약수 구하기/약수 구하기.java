import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            N, K
            - N의 약수들 중 K번째로 작은 수 출력
            - N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않으면 0 출력
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;

                if (count == K) {
                    result = i;
                    break;
                }
            }


        }
        br.close();

        System.out.println(result);
    }
}