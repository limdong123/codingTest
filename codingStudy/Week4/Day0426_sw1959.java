package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1959 {

	public static void main(String[] args) throws IOException {
		//두 개의 숫자열 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] a = new int [n];
			int[] b = new int [m];
			int result = 0;
			int sum = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			
			if(n < m) {
				for(int i = 0; i < m-n+1; i++) {
					for(int j = i; j < i+n; j++) {
						if(j > m) {
							continue;
						}else {
							sum += a[j-i] * b[j];
						}
					}
					if(sum > result) {
						result = sum;
					}
					sum = 0;
				}
			} else if(n > m) {
				for(int i = 0; i < n-m+1; i++) {
					for(int j = i; j < i+m; j++) {
						if(j > n) {
							continue;
						}else {
							sum += b[j-i] * a[j];
						}
					}
					if(sum > result) {
						result = sum;
					}
					sum = 0;
				}
			}
			
			
			
			System.out.printf("#%d %d\n",(T+1), result );
		
		}

	}

}
