import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // 주어진 단어에서 알파벳 a~z / 단어에 포함되어있지 않으면 -1 출력, 단어에 포함되면 알파벳의 위치 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1; // 배열 초기화
        }

        String str = br.readLine(); // 입력받은 단어
        br.close();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // a, b, c, c => 97, 98, 99
            // [-1,-1,-1,-1.....]

            // [0, 1, 2, -1, -1 ....]

            // 97 = a의 아스키코드
            if (arr[ch - 'a'] == -1) {  // ch의 값이 a라면 97 - 97 => arr[0]번째 값이 -1이면 i값 셋팅
                arr[ch - 'a'] = i;      // 동일한 알파벳이 단어안에 들어가 있을경우 i값 변경되지 못하게끔 if문으로 구별
            }

        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}