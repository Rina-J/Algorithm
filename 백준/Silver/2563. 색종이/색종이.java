import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            첫줄에 색종이 갯수
            흰색 도화지 : 가로 세로 각각 100
            검은색 색종이 : 가로 세로 각각 10
            
            3 : 색종이 갯수
            3 7  : 가로 도화지 ~ 색종이 / 세로 도화지 ~ 색종이
            15 7
            5 2
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] white = new int[100][100];
        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            for(int j = num1; j < num1+10; j++){
                for(int k = num2; k < num2+10; k++){
                    if(white[j][k] == 0){
                        white[j][k] = 1;
                        total++;
                    }
                }
            }
        }
        br.close();

        System.out.print(total);
    }
}