package Week7;

import java.util.Scanner;

public class Day0516_sw1204 {

	public static void main(String[] args) {
		// 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int T = 0; T < test_case; T++) {
			
			int n = sc.nextInt(); // 테스트 케이스 넘버 
			int max_cnt = 0;
			int result = 0;
			int[] score = new int[101];
			for(int i = 0; i < 1000; i++) {
				score[sc.nextInt()]++;
			}
			
			for(int i = 0; i < 101; i++) {
				if(max_cnt <= score[i]) {
					max_cnt = score[i];
					result = i;
				}
				
			}
			
			System.out.printf("#%d %d\n", n, result);
			
		}
	}

}
