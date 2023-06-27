package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day230417_sw1979 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 1; T < test_case+1; T++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			//흰색 = 1, 검은색 = 0, 흰색에 들어감 
			int cnt = 0;
			int rcnt = 0;
			int result = 0;
			//가로
			for(int i = 0; i < n; i++) {
				cnt=0;
				rcnt=0;
				for(int j = 0; j < n; j++) {
					if(map[i][j] == 1) {
						cnt++;
						if(j == n-1) {
							if(cnt == k) {
								result++;
							}
							cnt = 0;
						}
					} else if(map[i][j] == 0 || j == n-1){
						if(cnt == k) {
							result++;
						}
						cnt = 0;
					}
					if(map[j][i] == 1) {
						rcnt++;
						if(j == n-1) {
							if(rcnt == k) {
								result++;
							}
							rcnt = 0;
						}
					} else if(map[j][i] == 0){
						if(rcnt == k) {
							result++;
						}
						rcnt = 0;
					} 
				}
			}
			System.out.printf("#%d %d\n", T, result);
		}	
	}
}
