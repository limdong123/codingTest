package Week7;

import java.util.Scanner;

public class Day0519_sw4789 {

	public static void main(String[] args) {
		// 4789. 성공적인 공연 기획
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int T = 0; T < test_case; T++) {
			
			//110011
			//11 00 1 1
			String input = sc.next();
			int[] data = new int[input.length()];
			int result = 0;
			int cnt = 0;
			
			for(int i = 0; i < input.length(); i++) {
				data[i] = (int)(input.charAt(i) - '0');
			}
			
			for(int i = 0; i < data.length; i++) {
				
				if(i == 0) {
					cnt += data[i];
				}else {
					if(data[i] > 0) {
						if(cnt >= i) {
							cnt += data[i];
						}else {
							result += i - cnt;
							cnt = i + data[i];
						}
					}
				}
			}
			System.out.printf("#%d %d\n", (T+1), result);
		}

	}

}
