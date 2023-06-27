package codingStudy.week1;
import java.util.Scanner;
//1209. [S/W 문제해결 기본] 2일차 - Sum
public class No04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//총 10개의 테스트 케이
		for(int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			int sumMax = 0;
			int rSum = 0;
			int cSum = 0;
			
			//100*100 배열 입
			int [][] arr = new int[100][100];
			
			for(int i =0; i<100; i++) {
				for(int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			//행 합, 열 합 구하
			for(int r = 0; r < 100; r++) {
				rSum = 0;
				cSum = 0;
				for(int c = 0; c < 100; c++) {
					//arr[r][c]일때 행 열 합 구하기 
					rSum += arr[r][c];
					cSum += arr[c][r];
				}
				if(rSum > sumMax) {
					sumMax = rSum;
				}
				if(cSum > sumMax) {
					sumMax = cSum;
				}
			}
			
			//대각선 합 구하기 
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 0; i<100; i++) {
				sum1 += arr[i][i]; //좌상우하 대각선 00 11 -> 99,99
				sum2 += arr[i][99-i]; //우상좌하 대각선 0,99 1,98 -> 99,0
			}
			if(sum1 > sumMax) {
				sumMax = sum1;
			}
			if(sum2 > sumMax) {
				sumMax = sum2;
			}
			
			System.out.printf("#%d %d\n", test_case, sumMax);	
		}	
	}
}
