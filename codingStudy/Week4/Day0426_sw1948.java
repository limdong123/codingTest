package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1948 {

	public static void main(String[] args) throws IOException {
		// 1948. 날짜 계산기 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int a_m = Integer.parseInt(st.nextToken());
			int a_d = Integer.parseInt(st.nextToken());
			int b_m = Integer.parseInt(st.nextToken());
			int b_d = Integer.parseInt(st.nextToken());
			
			int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int result = 0;
			
			for(int i = a_m; i <= b_m; i++) {
				result += day[i];
			}
			result -= a_d;
			result -= day[b_m] - b_d;
			
			System.out.printf("#%d %d\n", (T+1), result+1);
		}
		

	}

}
