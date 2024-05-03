import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // 첫줄은 테스트 케이스 개수
        // 입력으로 받은 문자열의 첫 글자, 마지막 글자 출력
        // 문자열 : 알파벳 A~Z 대문자

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            System.out.println(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length()-1)));
        }

        br.close();
    }
}