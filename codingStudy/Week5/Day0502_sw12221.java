package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw12221 {

	public static void main(String[] args) throws IOException {
		// 12221. 구구단2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int result = 0;
			if(A >= 10 || B >= 10) {
				result = -1;
			}else {
				result = A*B;
			}
			System.out.printf("#%d %d\n", (T+1), result);
			
		}
		
	}

}
