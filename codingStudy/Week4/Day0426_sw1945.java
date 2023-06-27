package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1945 {

	public static void main(String[] args) throws IOException {
		// 1945. 간단한 소인수분해
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			//2,3,5,7,11
			int[] result = new int[5];
			int[] num = {2,3,5,7,11};
			
			while(n > 1) {
				for(int i = 0; i < 5; i++) {
					if(n%num[i] == 0) {
						n = n/num[i];
						result[i] += 1;
					} 
				}
			}
			
			System.out.printf("#%d ", (T+1));
			for(int i = 0; i < 5; i++) {
				System.out.printf("%d ", result[i]);
			}
			System.out.println();
			
		}
		
	}

}
