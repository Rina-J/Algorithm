import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            f(n) = a1n + a0, O(n) 정의를 만족하는지 여부
            f(n), c, n0가 O(n) 정의를 만족하면 1, 아니면 0을 출력

            첫줄 :  함수 f(n)을 나타내는 정수 a1, a0
            둘째줄 : 양의정수 c
            셋째줄 : 양의정수 n0

            7   7
            8
            1

            f(n) = 7n + 7, g(n) = n, c = 8, n0 = 1이다. f(1) = 14, c × g(1) = 8이므로 O(n) 정의를 만족x

            7   7
            8
            10

            f(n) = 7n + 7, g(n) = n, c = 8, n0 = 10이다. 모든 n ≥ 10에 대하여 7n + 7 ≤ 8n 이므로 O(n) 정의를 만족o

         */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if ((a1 * n0 + a0 <= c * n0) && c >= a1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        br.close();
    }
}