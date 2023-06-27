package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw12741 {

	public static void main(String[] args) throws IOException {
		// 12741. 두 전구
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			
			//x 전구 켜진시간 -> A ~ B
			//y 전구 켜진시간 -> C ~ D
			//꺼질때 시간은 추가 안함 
			//50000개 테스트 케이스 
			int result = 0;
			
			if(A > C) {
				//A부터
				if(B > D) {
					//D까지 
					result = D - A;
				}else {
					//B까지 
					result = B - A;
				}
			}else {
				//C부터 
				if(B > D) {
					//D까지 
					result = D - C;
				}else {
					//B까지 
					result = B - C;
				}
			}
			if(result < 0) {
				result = 0;
			}
			System.out.printf("#%d %d\n", (T+1), result);
			
		}

	}

}
