package Week7;

import java.util.Scanner;

public class Day0519_sw3314 {

	public static void main(String[] args) {
		// 3314. 보충학습과 평균
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int T = 1; T <= test_case; T++) {
			
//			 40점 미만인 학생은 40점을 받게 되는 것과 같다.
//			 보충을 받을 학생이 모두 보충을 받고 나면 점수의 평균이 몇인지 출력
				
			int[] input = new int[5];
			int sum = 0;
			
			for(int i = 0; i < 5; i++) {
				input[i] = sc.nextInt();
				if(input[i] < 40) {
					input[i] = 40;
				}
				sum += input[i];
			}
			
			System.out.printf("#%d %d\n", T, sum/5);
			
		}

	}

}
