package Week6;

import java.util.Scanner;

public class Day0508_sw10200 {

	public static void main(String[] args) {
		// 10200. 구독자 전쟁
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for(int T = 0; T < test_case; T++) {
			
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result_min = 0;
			int result_max = 0;
			
			if(a > b) {
				result_max = b;
				if(a+b > n) {
					result_min = a + b - n;
				}else {
					result_min = 0;
				}
			}else {
				result_max = a;
				if(a+b > n) {
					result_min = a + b - n;
				}else {
					result_min = 0;
				}
			}
			System.out.printf("#%d %d %d\n", (T+1), result_max, result_min);
		}

	}

}
