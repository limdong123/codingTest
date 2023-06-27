package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day0502_sw13038 {

	public static void main(String[] args) throws IOException {
		// 13038. 교환학생
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			//n  = 들어야 하는 수업의 수 
			//a[] = 수업을 진행하는 요일 1(O), 0(X)
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] a = new int[7];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 7; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			//a[i]에서 1을 찾고 거기부터 cnt++해서 날짜 계산 1을 만날때마다 n-1 
			//while문에서 n이 0이 될때 까
			int cnt = 0; // 7일에 수업 듣는 수 
			int result = Integer.MAX_VALUE;
			for(int i = 0; i < 7; i++) {
				if(a[i] == 1) {
					cnt++;
				}
			}
			int[] point = new int[cnt];
			int index = 0;
			for(int i = 0; i < 7; i++) {
				if(a[i] == 1) {
					point[index] = i;
					index++;
				}
			}
			
			//point의 변화에 따른 경우의 숫자중 최솟값이 결과값이다. 
			for(int i = 0; i < cnt; i++) {
				int nc = n;
				int now_result = 0;
				int now_point = point[i];
				while(nc > 0) {
					if(nc == n) {	// 첫주 
						for(int j = now_point; j < 7; j++) {
							now_result++;
							if(a[j] == 1) {
								nc = nc -1;
								if(nc == 0) {
									break;
								}
							}
						}
					}else { // 그외 주 
						for(int j = 0; j < 7; j++ ) {
							now_result++;
							if(a[j] == 1) {
								nc = nc-1;
								if(nc == 0) {
									break;
								}
							}
						}
					}
				}
				if(result > now_result) {
					result = now_result;
					now_result = 0;
				}
			}
			
			
			
			System.out.printf("#%d %d\n", (T+1), result);
		}

	}

}
