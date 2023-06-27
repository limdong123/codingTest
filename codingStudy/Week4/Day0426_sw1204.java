package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1204 {

	public static void main(String[] args) throws IOException {
		// 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int k = Integer.parseInt(st.nextToken());
			
			int[] cnt = new int[101];
			int max_cnt = 0;
			int result = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 1000; i++) {
				int n = Integer.parseInt(st.nextToken());
				
				cnt[n] += 1;
			}
			
			for(int i = 0; i < 101; i++) {
				if(max_cnt <= cnt[i]) {
					max_cnt = cnt[i];
					result = i;
				}
			}
			System.out.printf("#%d %d\n", (T+1), result);
		}
		
	}

}
