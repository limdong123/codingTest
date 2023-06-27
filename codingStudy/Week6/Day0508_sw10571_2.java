package Week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0508_sw10571_2 {
	
	public static int Palindrome(int n) {
		if(n < 10) {
			return 1;
		}else {
			String s = Integer.toString(n);
			int center = s.length()/2;
			String top = s.substring(0,center);
			String bottom = s.substring(s.length()%2 == 0 ? center : center+1,s.length());
			
			if(top.equals(bottom)) {
				return 1;
			}else {
				return 0;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// 10570. 제곱 팰린드롬 수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = 0;
			int lower = (int) Math.ceil((Math.sqrt(a)));
			int upper = (int) Math.sqrt(b);

			//a~b사이의 제곱 팬린드롬 수, 그냥도 루트도 팬린드롬 수 
			for(int i = lower; i <= upper; i++) {
				if(Palindrome(i) == 1) {
					if(Palindrome(i*i) == 1) {
						result++;
					}
				}
			}
			
			System.out.printf("#%d %d\n", (T+1), result);
		}

	}

}
