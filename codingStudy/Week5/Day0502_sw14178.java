package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw14178 {

	public static void main(String[] args) throws IOException {
		// 14178. 1차원 정원

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			//n = 정원 크기 , d = 분무기 범위 (x-d, x+d)
			
			//d가 주어지면 총 분무기 범위는 d*2+1
			
			int result = 0;
			for(int i=0; ; i++) {
				n = n - (d*2+1);
				result++;
				if(n <= 0) {
					break;
				}
			}
			System.out.printf("#%d %d\n", (T+1), result);
		}
		
	}

}
