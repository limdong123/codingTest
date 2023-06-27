package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1946 {

	public static void main(String[] args) throws IOException {
		// 1946. 간단한 압축 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			String[] ap = new String[n];
			int[] apCnt = new int [n];
			int result_cnt = 0;
			 
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				ap[i] = st.nextToken();
				apCnt[i] = Integer.parseInt(st.nextToken());
				result_cnt += apCnt[i];
			}
			
			int result_y = result_cnt/10 + 1;
			String[][] result = new String[result_y][10];
			int a = 0;
			int cnt = 0;
			
			for(int i = 0; i < result_y; i++) {
				for(int j = 0; j < 10; j++) {
					if(cnt != result_cnt) {
						result[i][j] = ap[a];
						cnt++;
						if(cnt == apCnt[a]) {
							result_cnt = result_cnt - cnt;
							cnt = 0;
							a += 1;
						}
					}
				}
			}
			
			System.out.printf("#%d\n", (T+1));
			for(int i = 0; i < result_y; i++) {
				for(int j = 0; j < 10; j++) {
					if(result[i][j] != null)
					System.out.printf("%s", result[i][j]);
				}
				System.out.println();
			}
			
		}
		
	}

}
