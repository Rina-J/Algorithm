import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; // 알파벳 배열

        for (int i = 0; i < 26; i++) {
            arr[i] = -1; // 배열 초기화
        }

        // a, b, c => 97, 98, 99
        // A, B, C => 65, 66, 67

        // 대문자, 소문자 나눠서 구분
        String str = br.readLine();
        br.close();

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { // 대문자
                arr[str.charAt(i) - 65]++;
            } else { // 소문자
                arr[str.charAt(i) - 97]++;
            }
        }

        int max = -1;
        char answer = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer = (char) (i + 'A');
            } else if (max == arr[i]) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}