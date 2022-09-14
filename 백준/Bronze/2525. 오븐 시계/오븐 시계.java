import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int H = Integer.parseInt( st.nextToken() ); // hour
		int M = Integer.parseInt( st.nextToken() ); // minute
		
		int time = Integer.parseInt( br.readLine() ); // 조리시간
		
		int min = 60 * H + M; // 시(H)와 분(M)을 하나의 분으로 변환
        min += time; // min에 주어진 요리하는데 걸리는 시간(time)을 더하기
 
        int hour = (min / 60) % 24; // 시가 24시 이상이 될 경우 0시부터 시작하도록 해줘야함(25이면 24로 나눈 나머지는 1, 23이면 24로 나눈 나머지는 23)
        int minute = min % 60;
 
        System.out.println(hour + " " + minute);
	}
}