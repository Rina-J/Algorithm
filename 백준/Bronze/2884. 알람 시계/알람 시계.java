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
		
		if( M<45 ) { // 분이 45보다 작으면 H를 -1시간 해줘야함
			H--;
			M = 60 + ( M-45 ); // M이 45보다 작으면 M에서 우선 45를 빼주고 60을 더해주면 됨
			if( H<0 ) { // H가 0보다 작으면 23시로 셋팅해줘야함
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + ( M-45 ) );
		}
	}
}