package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day230417_sw2001 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 1; T < test_case+1; T++) {
			st = new StringTokenizer(br.readLine());
		
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[n][n];
			int maxCnt = 0;
			int sum = 0;
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < n-m+1; i++) {
				for(int j = 0; j < n-m+1; j++) {
					sum = 0;
					for(int k = i; k < i+m; k++) {
						for(int l = j; l < j+m; l++) {
							sum += map[k][l];
						}
					}
					if(maxCnt < sum) {
						maxCnt = sum;
					}
				}
			}
			
			System.out.printf("#%d %d", T, maxCnt);
			
		}
	}
}
