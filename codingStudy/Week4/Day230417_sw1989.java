package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day230417_sw1989 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 1; T < test_case+1; T++) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			char[] chars = input.toCharArray();
			int result = 0;
			
			for(int i = 0; i < input.length()/2; i++) {
				if(chars[i] != chars[input.length() - i -1]) {
					result = 0;
					break;
				}else {
					result = 1;
				}
			}
			System.out.printf("#%d %d\n", T, result);
		}	
	}
}
