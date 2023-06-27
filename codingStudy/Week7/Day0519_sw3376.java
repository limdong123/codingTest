package Week7;

import java.util.Scanner;

public class Day0519_sw3376 {

	public static void main(String[] args) {
		// 3376. 파도반 수열
		
		Scanner sc = new Scanner(System.in);
		int test_case =sc.nextInt();
		for(int T = 1; T <= test_case; T++) {
			
			int n = sc.nextInt();
			//현재 만들어진 나선에서 가장 긴 변에 그 변의 길이와 같은 크기의 정삼각형을 추가해 넣는다. 파도반 수열 PN은 나선에 N번째로 추가한 나선의 길이를 의미하는 수열이다.
			long[] map = new long[n];
			//1 1 1 2 2 3 4 5 7 9 12 16
			//9(i) = i-2 i-3
			//3(i) = i-2 i-3
			for(int i = 0; i < n; i++) {
				if(i < 3) {
					map[i] = 1;
				}else {
					map[i] = map[i-2] + map[i-3];
				}
			}
			
			System.out.printf("#%d %d\n", T, map[n-1]);
			
		}

	}

}
