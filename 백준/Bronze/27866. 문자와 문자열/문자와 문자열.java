import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        
        // 단어S, 정수 i
        // 단어의 i번째 글자 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine())-1;

        br.close();

        System.out.println(str.charAt(n));
    }

}