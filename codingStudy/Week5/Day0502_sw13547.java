package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw13547 {

	public static void main(String[] args) throws IOException {
		// 13547. 팔씨름
		//15번 팔씨름을 하여 8번 이상 이기는 사람이 점심 값을 면제
		//x가 8번 이상이면 No이다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			char[] input = st.nextToken().toCharArray();
			int cnt = 0;
			String result = "";
			for(int i = 0; i < input.length; i++) {
				if(input[i] == 'x') {
					cnt++;
				}
			}
			if(cnt >= 8) {
				result = "NO";
			}else {
				result = "YES";
			}
			
			System.out.printf("#%d %s\n", (T+1), result);
			
		}
		
	}

}
