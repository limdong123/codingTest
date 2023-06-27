package Week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0508_sw10580 {

	public static void main(String[] args) throws IOException {
		// 10580. 전봇대
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[][] ab = new int[n][2];
			int result = 0;
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				ab[i][0] = Integer.parseInt(st.nextToken());
				ab[i][1] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					if(ab[i][0] > ab[j][0] && ab[i][1] < ab[j][1]) {
						result++;
					}else if(ab[i][0] < ab[j][0] && ab[i][1] > ab[j][1]) {
						result++;
					}
				}
			}
			
			System.out.printf("#%d %d\n", (T+1), result);
		}
		

	}

}
