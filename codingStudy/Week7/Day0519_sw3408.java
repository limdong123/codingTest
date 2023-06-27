package Week7;

import java.util.Scanner;

public class Day0519_sw3408 {

	public static void main(String[] args) {
		// 3408. 세가지 합 구하기
//		N을 입력 받아 다음의 세 가지 합을 구하는 프로그램을 작성하라.
//
//		S1 = 양의 정수 중에서 작은 순서대로 N개의 합.
//
//		S2 = 양의 정수 중 홀수인 것들 중에서 작은 순서대로 N개의 합.
//
//		S3= 양의 정수 중 짝수인 것들 중에서 작은 순서대로 N개의 합.
//
//		예를 들어 N = 5의 입력이 들어왔을 경우,
//
//		S1 = 1 + 2 + 3 + 4 + 5,
//
//		S2 = 1 + 3 + 5 + 7 + 9,
//
//		S3 = 2 + 4 + 6 + 8 + 10 이다.
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		for(int T = 1; T <= test_case; T++) {
			
			long n = sc.nextInt();
			long s1 = 0,s2 = 0,s3 = 0;
			s1 = (n*(n+1))/2;
			s3 = s1*2;
			s2 = s3 - n;
			
			System.out.printf("#%d %d %d %d\n", T, s1, s2, s3);
			
		}

	}

}
