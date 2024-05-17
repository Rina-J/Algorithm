import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            첫째줄 N B
            N : B진법의 값인 N
            B : B진법
            
            B진법 수 N을 10진법으로 출력

            ZZZZZ 36

            (2 ≤ B ≤ 36)

            - 어떤 진수든 10진수로 바꾸는 방법은 똑같다
            - 각 자리의 10진수 숫자 * 진수의 각 자리수 제곱을 모두 더한 값이다
            ex) 2진수 1101 일때
            1*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 13
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        long result = 0;
        int idx = 0; // 지수
        int num = 0; // 10진수로 변환한 수를 저장

        for (int i = N.length() - 1; i >= 0; i--) { // N의 오른쪽(1의자리)부터 계산하기 위함
            char c = N.charAt(i);
            if (c >= '0' && c <= '9') { // 0 ~ 9 사이일 경우
                num = c - '0'; // 숫자 그대로 출력 : '0'의 아스키 코드값은 48, '1'은 49 ... '5'는 53, 53 - '0' = 5
            } else {
                num = c - 55; // 숫자로 변경하여 저장
                // A ~ Z 를 10~35 숫자로 매핑하기위해 아스키코드에서 'A'는 65 이므로 'A'를 10으로 매핑하기 위해 55를 빼줌
            }                      
            result += num * Math.pow(B, idx++);
        }                   //ㄴ 제곱 계산하는 함수 Math.pow(밑수, 지수) 35*36^4 35*36^3 35*36^2 35*36^1 35*36^0
        br.close();

        System.out.print(result);
    }
}