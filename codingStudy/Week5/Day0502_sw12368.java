package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw12368 {

	public static void main(String[] args) throws IOException {
		// 12368. 24시간
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
//			 A시간이 지났다. 앞으로 정확히 B시간이 더 지난다면, 24시간제 시계에서 그 때는 몇 시일까?
			
			int sum = A+B;
			int result = 0;
			
			if(sum >= 24) {
				result = sum-24;
			}else {
				result = sum;
			}
			
			System.out.printf("#%d %d\n", (T+1), result);
			
		}
		
	}

}
