import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // 크로아티아 알파벳 (c=, c-, dz=, d-, lj, nj, s=, z=), 나머지 단어는 한개씩 카운트
        // 최대 100개 글자의 단어가 주어짐,  알파벳 소문자와 '-', '='로만 구성됨
        // c, d, l, n, s, z
        // =, - 필터
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        br.close();

        int n = str.length();
        int count = 0;

        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);

            if(ch == 'c' && i < n - 1) {

                //만약 ch 다음 문자가 '=' 또는 '-'
                if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    // c=, c- 는 i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                    i++;
                }

            } else if(ch == 'd' && i < n - 1) {

                if(str.charAt(i + 1) == '-') {	// d- 일 경우
                    i++;
                } else if(str.charAt(i + 1) == 'z' && i < n - 2) {

                    if(str.charAt(i + 2) == '=') {	// dz= 일 경우 문자가 3개이기때문에 i+2 해줘야함
                        i += 2;
                    }
                }

            } else if((ch == 'l' || ch == 'n') && i < n - 1) {

                if(str.charAt(i + 1) == 'j') {	// lj 또는 nj 일 경우
                    i++;
                }

            } else if((ch == 's' || ch == 'z') && i < n - 1) {

                if(str.charAt(i + 1) == '=') {	// s= 또는 z= 일 경우
                    i++;
                }

            }

            count++;
        }

        System.out.println(count);
    }
}