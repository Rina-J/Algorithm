import java.io.*;
import java.util.ArrayList;
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

        ArrayList<Character> list = new ArrayList<>(); // Character 타입으로 선언

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) { // 몫이 0보다 큰 경우
            if (N % B < 10) { // 나머지가 10보다 작을 경우
                list.add((char) (N % B + '0'));
                //ㄴ 숫자 그대로 출력 : '0'의 아스키 코드값은 48, '1'은 49 ... '6'은 54 => 문자열 list에 추가해야하므로 '0' 더해줌
            } else {
                list.add((char) ((N % B) + 55));
            }
            N /= B; // B로 나눈 몫 갱신
        }

        br.close();

        for (int i = list.size() -1; i >=0; i--) { //거꾸로 출력해야 하므로
            System.out.print(list.get(i));
        }
    }
}