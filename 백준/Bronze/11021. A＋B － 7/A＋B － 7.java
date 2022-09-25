import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	   
    	int total = Integer.parseInt(br.readLine());
    	    	
    	StringTokenizer st;

    	for( int i=1; i<=total; i++ ) {
    		
    		st = new StringTokenizer(br.readLine());
    		
    		System.out.println( "Case #" + i + ": "
    				+( Integer.parseInt( st.nextToken() )
    				+Integer.parseInt( st.nextToken() ) ) );
    		
    	}
    	br.close();    	
    }
}   