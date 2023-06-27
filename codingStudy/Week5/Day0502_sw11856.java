package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw11856 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 11856. 반반
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int test_case = Integer.parseInt(br.readLine());
		for(int T = 0; T < test_case; T++) {
//			S에 정확히 두 개의 서로 다른 문자가 등장하고
//			각 문자가 정확히 두 번 등장하는 지 판별하라.
			
			String S = br.readLine();
			char[] s = S.toCharArray();
			String result = "Yes";
			
			for(int i = 0; i < 4; i++) {
				int cnt = 0;
				for(int j = 0; j < 4; j++) {
					if(s[i] == s[j]) {
						cnt++;
					}
				}
				if(cnt != 2) {
					result = "No";
				}
			}
			System.out.printf("#%d %s\n", (T+1), result);
			
		}

	}

}
