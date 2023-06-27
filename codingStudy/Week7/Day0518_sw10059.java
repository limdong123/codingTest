package Week7;

import java.util.Scanner;

public class Day0518_sw10059 {

	public static void main(String[] args) {
		// 10059. 유효기간
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int T = 0; T < test_case; T++) {
			
			int n = sc.nextInt();
			
			int a = n/100;
			int b = n%100;
			
			//a >= 12, b >= 12 -> AMBIGUOUS
			//a < 12, b >= 12 -> YYMM
			//a >= 12, b < 12 -> MMYY
			//a < 12, b < 12 -> NA
			if(a > 12 && b <= 12) {
				System.out.printf("#%d YYMM\n", (T+1));
			}else if(a <= 12 && b > 12) {
				System.out.printf("#%d MMYY\n", (T+1));
			}else if(a > 12 && b > 12) {
				System.out.printf("#%d NA\n", (T+1));
			}else if(a <= 12 && b <= 12) {
				System.out.printf("#%d AMBIGUOUS\n", (T+1));
			}
			
			
			
			
			
		}

	}

}
