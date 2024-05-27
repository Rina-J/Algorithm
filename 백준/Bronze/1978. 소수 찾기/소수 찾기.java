import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
           소수 찾기(: 1과 자기 자신만을 약수로 갖는 자연수)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0; // 주어진 수들 중 소수의 개수 저장

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(st.nextToken());

            // 1은 소수가 아니므로 j는 2부터 시작
            for (int j = 2; j <= num; j++) {
                if (j == num) {
                    count++; // j == num 이면 자기 자신까지 온거니까 count++ 해줌
                }
                if (num % j == 0) {
                    break;
                }
            }
        }
        br.close();
        
        System.out.println(count);
    }
}