import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine(), " ");  //정수 N개가 있는 수열 A
                
        for (int i=1; i<=n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a < x) 
            	sb.append(a + " ");  //수가 x보다 작으면 StringBuilder에 추가
        }
        System.out.print(sb);
    }
}   
