import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            N : 10진법 숫자 -> B진법으로 바꿔 출력
            ㄴ 10진법이 넘어가면 알파벳 대문자 사용 (A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35)
            첫째 줄에 N과 B 주어짐
            (2 ≤ B ≤ 36)

            60466175 36
            6*36^7 ....
            
            N % B 반복
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            if (N % B < 10) {
                sb.append(N % B);
            } else {
                sb.append((char) ((N % B) + 55));
            }
            N /= B;
        }

        br.close();

        System.out.print(sb.reverse());
    }
}