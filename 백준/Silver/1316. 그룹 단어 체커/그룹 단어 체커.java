import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // 그룹단어의 갯수 출력
        // 단어는 알파벳 소문자로만 구성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = n;

        for (int i = 0; i < n; i++) {

            String str = br.readLine();

            int prev = 0;
            int[] arr = new int[26];

            for (int j = 0; j < str.length(); j++) {

                int now = str.charAt(j); // 현재 알파벳의 아스키 코드값

                if (prev != now) { // 97 : a
                    if (arr[now - 97] == 0) {
                        arr[now - 97]++;
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        br.close();

        System.out.println(count);
    }
}