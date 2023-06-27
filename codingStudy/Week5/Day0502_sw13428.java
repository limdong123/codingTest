package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day0502_sw13428 {

	public static void main(String[] args) throws IOException {
		// 13428. 숫자 조작
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			char[] n = st.nextToken().toCharArray();
			
			//숫자 2개를 골라 위치를 바꿔 가장 작은 수와 가장 큰수를 출력 
			int n_min = Integer.parseInt(new String(n));
			int n_max = Integer.parseInt(new String(n));
			
			for(int i = 0; i < n.length; i++) {
				for(int j = 0; j < n.length; j++) {
					char[] n_copy = Arrays.copyOf(n, n.length);
					
						n_copy[i] = n[j];
						n_copy[j] = n[i];
						int chang = Integer.parseInt(new String(n_copy));
						int chang2 = chang;
						int cnt = 0;
						while(chang2 != 0) {
							chang2 = chang2/10;
							cnt++;
						}
						if(cnt == n.length) {
							n_min = Math.min(n_min, chang);
							n_max = Math.max(n_max, chang);
						}
				}
			}
//			if(n[0] =='0') {
//				n_min = 0;
//				n_max = 0;
//			}
			
			System.out.printf("#%d %d %d\n", (T+1), n_min, n_max);
			
		}
		
	}

}
