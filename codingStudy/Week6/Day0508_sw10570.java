package Week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0508_sw10570 {
	

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
			//a, b를 sqrt사용해
			int start = (int) Math.ceil(Math.sqrt(a));
			int end = (int)Math.sqrt(b);
			
			for(int i = start; i <= end; i++) {
				if(Check(i) == 1) {
					if(Check(i*i) == 1) {
						result++;
					}
				}
			}
			
			System.out.printf("#%d %d\n", (T+1), result);
		}

	}

	private static int Check(int n) {
		// TODO 팬드롬수를 체크하는 장소, 맞으면 retrun 1, 틀리면 0 
		if(n%10 == n) {
			return 1;
		}else {
			String num = Integer.toString(n);
			for(int i = 0; i < num.length()/2; i++) {
				if(num.charAt(i) != num.charAt(num.length()-1-i)) {
					return 0;
				}
			}
			return 1;
		}
	}

}
