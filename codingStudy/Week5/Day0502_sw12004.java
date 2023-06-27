package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw12004 {

	public static void main(String[] args) throws IOException {
		// 12004. 구구단 1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			String result = "No";
			
			for(int i = 1; i <= 9; i++) {
				for(int j = 1; j <= 9; j++) {
					if(n == i*j) {
						result = "Yes";
					}
				}
			}
			
			System.out.printf("#%d %s\n", (T+1), result);
			
		}

	}

}
