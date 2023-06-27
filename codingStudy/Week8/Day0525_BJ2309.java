package Week8;

import java.util.Arrays;
import java.util.Scanner;

public class Day0525_BJ2309 {

	public static void main(String[] args) {
		// 일곱 난쟁이, 브론즈1
		
		//7난쟁이의 키의 합이 100, 9명중 2명 제외하고 100이면 오름차순으로 출력 
		
		Scanner sc = new Scanner(System.in);
		int[] input = new int[9];
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			input[i] = sc.nextInt();
			sum += input[i];
		}
		
		Arrays.sort(input);
		
		//9개중 2개 선택 
		int[] bad = new int[2];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++ ) {
				if(i == j) {continue;}
				else {
					sum -= input[i] + input[j];
					if(sum == 100) {
						for(int k = 0; k < 9; k++) {
							if(k != i && k != j) {
								System.out.printf("%d\n", input[k]);
							}
						}
						break;
					}else {
						sum += input[i] + input[j];
					}
				}
			}
		}
		

	}

}
