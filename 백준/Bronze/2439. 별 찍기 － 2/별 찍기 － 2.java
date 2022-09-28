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
    		
    		for (int x=1; x<=total-i; x++) {
				System.out.print(" ");
			}
    		for (int y=1; y<=i; y++) {
				System.out.print("*");
			}	
    		System.out.println();
    	}
    }
}   
