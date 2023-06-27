package Week7;

import java.util.Scanner;

public class Day0519_sw3307 {

	public static void main(String[] args) {
		// 3307. 최장 증가 부분 수열
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int T = 1; T <= test_case; T++) {
			int n = sc.nextInt();
			int[] input = new int[n];
			int[] dp = new int[n];
			int max = 0;
			dp[0] = 1;
			for(int i = 0; i < n; i++) {
				input[i] = sc.nextInt();
			}
			
			for(int i = 1; i < n; i++) { //1~n
				dp[i] = 1;
				for(int j = 0; j < i; j++) { // 0 ~ i-1
					if(input[j] < input[i] && dp[j] + 1 > dp[i]) {
						dp[i] = dp[j] + 1;
					}
				}
				max = Math.max(dp[i], max);
			}
			
			System.out.printf("#%d %d\n", T, max);
		}

	}

}
