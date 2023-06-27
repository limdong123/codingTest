package Week7;

import java.util.Scanner;

public class Day0519_sw3456 {

	public static void main(String[] args) {
		// TODO 3456. 직사각형 길이 찾기

		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int T = 1; T <= test_case; T++) {
			
			int a,b,c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			int result = 0;
			
			if(a == b) {
				result = c;
			}else if(b == c) {
				result = a;
			}else if(a == c) {
				result = b;
			}
			
			System.out.printf("#%d %d\n", T, result);
			
		}

	}

}
