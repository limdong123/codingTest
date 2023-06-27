package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw11736 {

	public static void main(String[] args) throws IOException {
		// 11736. 평범한 숫자
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] p = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				p[i] = Integer.parseInt(st.nextToken());
			}
//			pi-1, pi, pi+1
//			최솟값도, 최댓값도 아니라면 pi를 평범한 숫자라고 정의한다. 주어진 순열에서 평범한 숫자의 개수는 몇 개인가?
			int result = 0;
			for(int i = 1; i < n-1; i++) {
				if(p[i-1] > p[i]) {
					if(p[i+1] < p[i]) {
						result++;
					}
				}
				if(p[i-1] < p[i]) {
					if(p[i+1] > p[i]) {
						result++;
					}
				}
			}
			System.out.printf("#%d %d\n", (T+1), result);
			
		}

	}

}
