package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1284 {

	public static void main(String[] args) throws IOException {
		// 1284. 수도 요금 경쟁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			
			//P = A사 요금 
			//Q = B사 기본요금, R = 기본요금 기준 양 
			//S = 초과 요금 
			//W 사용량 
			
			int A = P*W;
			int B = 0;
			if(R < W) {
				B = Q + (W-R)*S;
			} else {
				B = Q;
			}
			
			if(A > B) {
				System.out.printf("#%d %d\n", (T+1), B);
			} else {
				System.out.printf("#%d %d\n", (T+1), A);
			}
		}
		
	}

}
