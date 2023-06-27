package Week4;

import java.util.Scanner;

public class Day0501_sw15230 {

	public static void main(String[] args) {
		// 15230. 알파벳 공부
		//abcdefghijklmnopqrstuvwxyz
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		String ap = "abcdefghijklmnopqrstuvwxyz";
		
		for(int T = 0; T < test_case; T++) {
			
			String input = sc.next();
			int cnt = 0;
			
			for(int i = 0; i < input.length(); i++) {
				if(cnt < input.length()) {
					if(ap.charAt(i) == input.charAt(i)) {
						cnt++;
					} else {
						break;
					}
				}else if(cnt >= input.length()) {
					break;
				}
			}
			System.out.printf("#%d %d\n", (T+1), cnt);
		}
		
	}

}
