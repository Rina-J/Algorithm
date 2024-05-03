import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // 첫째 줄에 숫자의 개수
        // 둘째 줄에 주어진 숫자 N개의 모든 합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;

        br.close();

        for (int i = 0; i < n; i++) {
            sum += str.charAt(i) - '0'; // 문자열을 숫자형으로 변경
        }

        System.out.println(sum);
    }
}