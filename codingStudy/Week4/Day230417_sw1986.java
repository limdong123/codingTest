package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day230417_sw1986 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 1; T < test_case+1; T++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int result = 0;
			// - 짝수
			// + 홀수
			for(int i = 1; i <= num; i++) {
				if(i%2 == 0) {
					result -= i;
				} else {
					result += i;
				}
			}
			System.out.printf("#%d %d", T, result);
		}	
	}
}
