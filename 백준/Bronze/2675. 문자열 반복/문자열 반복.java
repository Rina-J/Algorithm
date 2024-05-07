import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String[] str = br.readLine().split(" "); // 숫자와 단어 분리하여 저장

            int count = Integer.parseInt(str[0]);

            String word = str[1];

            for (int j = 0; j < word.length(); j++) {

                for (int k = 0; k < count; k++) {
                    System.out.print(word.charAt(j));
                }

            }
            System.out.println();
        }
        br.close();
    }
}