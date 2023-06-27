package Week7;

import java.util.Scanner;

public class Day0518_sw5215 {
	
	static int n,l;
	static int result;
	static int[][] input;
	public static void main(String[] args) {
		// 5215. 햄버거 다이어트
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for(int T = 0; T < test_case; T++) {
			
			n = sc.nextInt();
			l = sc.nextInt();
			
			result = 0; //맛돌이 점수 합 
			input = new int [n][2]; 
			for(int i = 0; i < n; i++) {
				input[i][0] = sc.nextInt();
				input[i][1] = sc.nextInt();
			}
			
			dfs(0, 0, 0);
			System.out.printf("#%d %d\n",(T+1), result);
			
		}

	}

	private static void dfs(int start, int score, int kcal) {
		if(kcal > l) {
			return;
		}
		
		if(start == n) {
			if(kcal <= l) {
				result = Math.max(result, score);
			}
			return;
		}
		dfs(start + 1, score + input[start][0], kcal + input[start][1]);
		dfs(start + 1, score, kcal);
		
	}

}
