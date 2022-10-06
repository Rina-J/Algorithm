import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
        
		in.close();
		Arrays.sort(arr);// Arrays.sort() : 배열에 저장된 원소값을 오름차순으로 정렬해주는 메서드
		//ㄴ 최솟값은 배열의 첫번째, 최댓값은 배열의 마지막에 위치함(arr.length-1)
		
		System.out.print(arr[0] + " " + arr[N - 1]);
	}
}