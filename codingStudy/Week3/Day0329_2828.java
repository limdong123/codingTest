package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0329_2828 {

	public static void main(String[] args) throws IOException {
		// 입력 :n(스크린 크), m(바구니 크기)
		//		j(사과의 개수)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int j = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		
		int left = 0;
		int right = m - 1;
		
		for(int i = 0; i < j; i++) {
			st = new StringTokenizer(br.readLine());
			int input = Integer.parseInt(st.nextToken());
			input = input -1;
			if(right < input) {
				cnt = cnt + input - right;
				right = input;
				left = right - m + 1;
			} else if(left > input) {
				cnt = cnt + left - input;
				left = input;
				right = left + m - 1;
			}
			
		}
		System.out.println(cnt);
		
	}

}
