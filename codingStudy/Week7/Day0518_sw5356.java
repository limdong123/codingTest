package Week7;

import java.util.Scanner;

public class Day0518_sw5356 {

	public static void main(String[] args) {
		// 5356. 의석이의 세로로 말해요
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int T = 0; T < test_case; T++) {
			
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			String d = sc.next();
			String e = sc.next();
			
			String result = "";
			for(int i = 0; ; i++) {
				if(i < a.length()) {
					result += a.charAt(i);
				}
				if(i < b.length()) {
					result += b.charAt(i);
				}
				if(i < c.length()) {
					result += c.charAt(i);
				}
				if(i < d.length()) {
					result += d.charAt(i);
				}
				if(i < e.length()) {
					result += e.charAt(i);
				}
				
				if(i >= a.length() && i >= b.length() && i >= c.length() && i >= d.length() && i >= e.length()) {
					break;
				}
			}
			System.out.printf("#%d %s\n", (T+1), result);
//			Aa0FfBb1GgCc2HhDd3IiEe4Jj
//			Aa0aPAf985Bz1EhCz2W3D1gkD6x
		}

	}

}
