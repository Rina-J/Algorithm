import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int student[] = new int[30];

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            student[n - 1] = 1; // 출석한 학생 index에 1로 표기
        }

        for (int j = 0; j < 30; j++) {
            if (student[j] != 1)
                System.out.println(j + 1);
        }
        
    }
    
}