package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0501_sw14692 {

	public static void main(String[] args) throws IOException {
		// 14692. 통나무 자르기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int cnt = 0;
			String result = "";
			
//			2 3 4 5 6 7 8 10
//			1 0 2 2 2     1
//			a b b b b

//			while(true) {
//				if(n/2 == (double)n / 2) {
//					n = n/2;
//					cnt++;
//				}else {
//					if(cnt == 0 || cnt%2 == 0) {
//						result = "Bob";
//						break;
//					}
//					else {
//						result = "Alice";
//						break;
//					}
//				}
//			}
			
			if(n % 2 == 0) {
				result = "Alice";
			}else {
				result = "Bob";
			}
			
			System.out.printf("#%d %s\n", (T+1), result);
		}

	}

}
