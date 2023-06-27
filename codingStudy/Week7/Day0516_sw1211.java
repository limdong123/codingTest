package Week7;

import java.util.Scanner;

public class Day0516_sw1211 {

	public static void main(String[] args) {
		// 1211. [S/W 문제해결 기본] 2일차 - Ladder2
		//배열에서 내려올때 옆에 붙어 있으면 그곳으로 이동해서 내려감 
		//최소한 /꺽어야함 
		
		Scanner sc = new Scanner(System.in);
		for(int T = 0; T < 10; T++) {
			int test_case = sc.nextInt();
			int min_cnt = 100;
			
			int[][] map = new int[100][100];
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int y = 0; y < 100; y++) {
				int cnt = 0;
				for(int x = 0; x < 100; x++) {
					cnt++;
					if(map[y][x] == 1) {
						if(x-1 > 0 && map[y][x-1] == 1) {
							for(int i = x; i >= 0; i--) {
								
							}
						}
					
					}
				}
			}
			
		}

	}

}
