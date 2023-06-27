package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0419_sw1976 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int a_hour = Integer.parseInt(st.nextToken());
			int a_min = Integer.parseInt(st.nextToken());
			
			int b_hour = Integer.parseInt(st.nextToken());
			int b_min = Integer.parseInt(st.nextToken());
			
			int sum_hour = a_hour + b_hour;
			int sum_min = a_min + b_min;
			
			if(sum_min >= 60) {
				sum_hour += 1;
				sum_min -= 60;
			}
			if(sum_hour >= 13) {
				sum_hour -= 12;
			}
			
			System.out.printf("#%d %d %d\n", T+1, sum_hour, sum_min );
		}
		
	}

}
