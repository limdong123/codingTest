package Week7;

import java.util.Scanner;

public class Day0519_sw3431 {

	public static void main(String[] args) {
		// 3431. 준환이의 운동관리
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		for(int T = 1; T<= test_case; T++) {
			
			//L분 이상 U분 이하 운동 해야함, X(이번주 운동한 시간) 
			// 충분하면 0, 넘어가면 -1, 부족하면 부족한 시간 
			
			int l = sc.nextInt();
			int u = sc.nextInt();
			int x = sc.nextInt();
			int result = 0;
			
			if(l > x) {
				result = l - x;
			}else if(l <= x && u >= x) {
				result = 0;
			}else if(u < x) {
				result = -1;
			}
			System.out.printf("#%d %d\n", T,result);
			
			
		}

	}

}
