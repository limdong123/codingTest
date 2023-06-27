package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0419_sw1970 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
//			50,000 원
//			10,000 원
//			5,000 원
//			1,000 원
//			500 원
//			100 원
//			50 원
//			10 원
			int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			int[] result = new int[8];
			
			int input = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < 8; i++) {
				if(input >= money[i]) {
						//4300 = 4300/ 1000 = 4 
						int cnt = input / money[i];
						input = input - (money[i] * cnt);
						result[i] = cnt;
					
				}
			}
			System.out.println("#" + (T+1));
			for(int i = 0; i < 8; i ++) {
				System.out.printf("%d ", result[i]);
			}
			System.out.println();
		}
		
	}

}
