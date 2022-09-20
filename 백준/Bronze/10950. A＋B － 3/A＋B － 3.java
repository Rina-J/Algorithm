import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int totalNum = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;		
		
		for (int i=0; i<totalNum; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
			sb.append(a+b + "\n");

		}
 
		System.out.println(sb);
	}
}