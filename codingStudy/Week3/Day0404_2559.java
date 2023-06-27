package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0404_2559 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] data = new int[n];
		int[] sum = new int[n-k+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
//		n-k+1
		for(int i = 0; i < n-k+1; i++) {
			for(int j = i; j < i + k; j++) {
				sum[i] += data[j];
			}
		}
		
		int result = (-100*k)-1;
		
		for(int i = 0; i < sum.length; i++) {
			if(result < sum[i]) {
				result = sum[i];
			}
		}
			
		System.out.println(result);
	}

}
