import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	   
    	int total = Integer.parseInt(br.readLine());
    	br.close();
    	    	
    	for( int i=1; i<=total; i++ ) {
    		
    		for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
    		
    	}
    }
}   