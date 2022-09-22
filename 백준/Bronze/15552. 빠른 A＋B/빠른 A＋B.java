import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	   
    	int total = Integer.parseInt(br.readLine());
    	
    	StringBuilder sb = new StringBuilder();
    	
    	StringTokenizer st;

    	for( int i=1; i<=total; i++ ) {
    		st = new StringTokenizer(br.readLine());
    		
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		sb.append(x+y + "\n"); 		
    	}
    	br.close();
    	
    	System.out.println(sb);
    }
}   