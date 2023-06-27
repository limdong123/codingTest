package Week7;

import java.util.Scanner;

public class Day0519_sw3282 {
	
	static int n,k;
	static int[][] input;
	static int result;

	public static void main(String[] args) {
		// 3282. 0/1 Knapsack

		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		for(int T = 1; T <= test_case; T++) {
			
			n = sc.nextInt();//물건 개수 
			k = sc.nextInt();// 가방 부피 
			
			input = new int[n+1][2]; //[n][0] -> 부피, [1] -> 가치
			int[][] dp = new int[n+1][k+1];
			
			for(int i = 0; i < n; i++) {
				input[i][0] = sc.nextInt();
				input[i][1] = sc.nextInt();
			}
			
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= k; j++) {
					if(input[i][0] > j) {
						dp[i][j] = dp[i-1][j];
					}else {
						dp[i][j] = Math.max(dp[i-1][j-input[i][0]] + input[i][1], 
								dp[i - 1][j]);
								
					}
				}
			}
			
			System.out.printf("#%d %d\n", T, dp[n][k]);
			
		}
	

	}

}
