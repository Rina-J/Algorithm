import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // 알파벳 소문자, 대문자, 숫자 0-9중 입력받은 글자의 아스키 코드값 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        br.close();

        int n = str.charAt(0);

        System.out.println(n);
    }
}