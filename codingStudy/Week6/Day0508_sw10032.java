package Week6;

import java.util.Scanner;

public class Day0508_sw10032 {

	public static void main(String[] args) {
		// 10032. 과자 분배
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int T = 0; T < test_case; T++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			if(n%k == 0) {
				System.out.printf("#%d 0\n", (T+1));
			}else {
				System.out.printf("#%d 1\n", (T+1));
			}
		}
	}

}
