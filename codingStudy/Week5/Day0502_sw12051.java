package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw12051 {

	public static void main(String[] args) throws IOException {
		// 12051. 프리셀 통계

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			//D<= N
			long n = Long.parseLong(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
//			오늘 한 D판 중 정확히 PD 퍼센트의 게임을 이겼고, 
//			지금까지 한 G판 중 정확히 PG 퍼센트의 게임을 이겼다. 
			// n = 게임 한 판 
			// d = D판중 이긴 퍼센
			// g = 총 퍼센
			String result = "Broken";
			if((d != 100 && g == 100)||(d != 0 && g == 0)) {
				result = "Broken";
			}else {
				for(long k = 1; k <= n; k++) {
					if((k *  d)%100 == 0) {
						result = "Possible";
						break;
					}
				}
			}
			System.out.printf("#%d %s\n", (T+1), result);
			
		}
	}


}
