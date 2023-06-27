package Week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0508_sw10804 {

	public static void main(String[] args) throws IOException {
		// 10804. 문자열의 거울상
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			 
			String input = st.nextToken();
			String result = "";
			
			// q => p, p => q, b => d, d => b
			for(int i = input.length()-1; i >= 0; i--) {
				if(input.charAt(i) == 'q') {
					result +=  'p';
				}else if(input.charAt(i) == 'p') {
					result +=  'q';
				}else if(input.charAt(i) == 'b') {
					result +=  'd';
				}else if(input.charAt(i) == 'd') {
					result +=  'b';
				}
			}
			System.out.printf("#%d %s", (T+1), result);
		}

	}

}
