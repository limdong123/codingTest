package Week7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day0512_sw1206 {

	public static void main(String[] args) throws IOException {
		// 1206. [S/W 문제해결 기본] 1일차 - View
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = 10;
		
		for(int T = 0; T < test_case; T++) {
			
			int n = sc.nextInt();
			
			int[] map = new int[n];	
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				map[i] = sc.nextInt();
			}
			
			//양 옆 2칸안에 없어야 함 
			for(int i = 0; i < n; i++) {
				int build_max = 0;
				for(int j = i-2; j <= i+2; j++) {
					if(j < 0 || j >= n || j == i)continue;
					else {
						if(map[j] >= build_max) {
							build_max = map[j];
						}
					}
				}
				if(map[i] > build_max) {
					cnt += map[i] - build_max;
				}
			}
			
			System.out.printf("#%d %d\n", (T+1), cnt);
		}
				

	}

}
