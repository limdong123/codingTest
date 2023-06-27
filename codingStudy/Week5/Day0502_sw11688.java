package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw11688 {

	public static void main(String[] args) throws IOException {
		// 11688. Calkin-Wilf tree 1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			String S = br.readLine();
			char[] s = S.toCharArray();
			int[] result = {1, 1};
			
			for(int i = 0; i < s.length; i++) {
				if(s[i] == 'L') {
					result[0] = result[0];
					result[1] = result[1] + result[0];
				}else {
					result[1] = result[1];
					result[0] = result[0] + result[1];
				}
			}
			
			System.out.printf("#%d %d %d\n", (T+1), result[0], result[1]);
				
		}
	}

}
