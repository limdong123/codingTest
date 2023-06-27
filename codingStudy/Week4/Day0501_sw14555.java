package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0501_sw14555 {

	public static void main(String[] args) throws IOException {
		// 14555. 공과 잡초
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			int result = 0;
			//(| |) ()
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == ')') {
					result++;
				}else if(input.charAt(i) == '(') {
					if(i < input.length()-1 && (input.charAt(i+1) == '|')) {
						result++;
					}
				}
			}
			System.out.printf("#%d %d\n", (T+1), result);
		}

	}

}
