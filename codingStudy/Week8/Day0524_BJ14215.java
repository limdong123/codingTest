package Week8;

import java.util.Arrays;
import java.util.Scanner;

public class Day0524_BJ14215 {

	public static void main(String[] args) {
		// 세 막대 //브론즈
		
		Scanner sc = new Scanner(System.in);
		
		int input[] = new int[3];
		int result = 0;
		//가장 긴 막대의 길이가 나머지 막대의 길이의 합보다 작아야 합니다.
		//a+b > c
		//긴막대가 a+b의 1만큼 작으면 조건 만족 
		
		for(int i = 0; i < 3; i++) {
			input[i] = sc.nextInt();
		}
		//마지막 가장 큼 
		Arrays.sort(input);
		
		if(input[2] < input[0] + input[1]) {
			result = input[0] + input[1] + input[2];
		}else {
			input[2] = input[1] + input[0] -1;
			result = input[0] + input[1] + input[2];
		}
		
		System.out.printf("%d", result);


	}

}
