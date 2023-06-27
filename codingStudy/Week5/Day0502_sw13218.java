package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw13218 {

	public static void main(String[] args) throws IOException {
		// 13218. 조별과제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			//3명 이상의 학생으로 구성된 조의 수를 최대화
			
			int result = 0;
			if(n/3 < 1) {
				result = 0;
			}else {
				result = n/3;
			}
			System.out.printf("#%d %d\n", (T+1), result);
		}
		
	}

}
