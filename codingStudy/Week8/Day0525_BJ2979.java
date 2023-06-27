package Week8;

import java.util.Scanner;

public class Day0525_BJ2979 {

	public static void main(String[] args) {
		// 트럭 주차, 브2

		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int result = 0;
		int min_start = 101;
		int max_end = 0;
		
		int[][] parking = new int[3][2];
		for(int i = 0; i < 3; i++) {
			parking[i][0] = sc.nextInt();
			parking[i][1] = sc.nextInt();
			min_start = Math.min(min_start, parking[i][0]);
			max_end = Math.max(max_end, parking[i][1]);
		}
		
		for(int i = min_start; i < max_end; i++) {
			int cnt = 0;
			for(int j = 0; j < 3; j++) {
				//포함 되어 있으면 (마지막엔 나가니까 신경 x)
				if(parking[j][0] <= i && parking[j][1] > i) {
					cnt++;
				}
			}
			if(cnt == 3) {
				result += c*3;
			}else if(cnt == 2) {
				result += b*2;
			}else if(cnt == 1) {
				result += a;
			}
		}
		
		System.out.printf("%d",result);
	}

}
