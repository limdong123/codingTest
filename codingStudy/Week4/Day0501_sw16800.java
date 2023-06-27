package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0501_sw16800 {

	public static void main(String[] args) throws IOException {
		// 16800. 구구단 걷기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			long n = Long.parseLong(st.nextToken());
			
			long result = n+1;
			
			for(long i = 2; i*i <= n; i++) {
				if(n%i == 0) {
					long a = i;
					long b = n/i;
					if(a+b-2 < result) {
						result = a+b-2;
					}
				}
			}
			
			System.out.printf("#%d %1d\n", (T+1), result);
			
		}
		
	}

}
