package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0501_sw16910 {

	public static void main(String[] args) throws IOException {
		//16910. 원 안의 점
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
//			x2+y2<=N2
			
			int result = 0;
			for(int i = -n; i <= n; i++) {
				for(int j = -n; j <= n; j++) {
					if(i*i + j*j <= n*n) {
						result++;
					}
				}
			}
			
			System.out.printf("#%d %d\n", (T+1), result);
			
		}
		
		
	}

}
