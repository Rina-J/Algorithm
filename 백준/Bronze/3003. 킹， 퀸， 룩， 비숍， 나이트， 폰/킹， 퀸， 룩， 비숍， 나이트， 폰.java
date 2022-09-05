import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int[] chess = {1, 1, 2, 2, 2, 8};  // 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수는 고정됨
        
        for (int i=0; i<chess.length; i++) {
            int findChess = Integer.parseInt(st.nextToken());// 찾은 피스의 갯수 = 콘솔에 입력한 입력값
            sb.append(chess[i] - findChess + " ");
        }
        System.out.print(sb);
    }
}