package Week7;

import java.util.Scanner;

public class Day0517_sw1209 {

	public static void main(String[] args) {
		// 1209. [S/W 문제해결 기본] 2일차 - Sum
		
		Scanner sc = new Scanner(System.in);
		for(int T = 0; T < 10; T++) {
			
			int t = sc.nextInt();
			int[][] map = new int[100][100];
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			//상하좌우sum구해서 최대값 구하기 
			int result = 0;
			int sum_col = 0;
			int sum_row = 0;
			
			//가로, 세로 
			for(int i = 0; i < 100; i++) {
				sum_col = 0;
				sum_row = 0;
				for(int j = 0; j < 100; j++) {
					sum_col += map[i][j];
					sum_row += map[j][i];
				}
				if(result < sum_col) {
					result = sum_col;
				}
				if(result < sum_row) {
					result = sum_row;
				}
			}
			
			//대각선 
			//40, 31, 22, 13 04
			int sum = 0;
			int sum2 = 0;
			for(int i = 0; i < 100; i++) {
				sum += map[i][i];
				sum2 += map[100 - i -1][i];
			}
			
			if(result < sum) {
				result = sum;
			}
			if(result < sum2) {
				result = sum2;
			}
			
			System.out.printf("#%d %d\n", t, result);
			
		}

	}

}
