package Week7;

import java.util.Scanner;

public class Day0519_sw5162 {

	public static void main(String[] args) {
		// 5162. 두가지 빵의 딜레마
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int T = 0; T < test_case; T++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int cnt = 0;
			while(c > 0) {
				if(c < a && c < b) {
					break;
				}
				if(a > b) {
					c = c - b;
					cnt++;
				}else {
					c = c - a;
					cnt++;
				}
			}
			
			
			System.out.printf("#%d %d\n", (T+1), cnt);
			
		}
				

	}

}
