package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw11285 {

	public static void main(String[] args) throws IOException {
		// 11285. 다트 게임
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			//  20 * (11 - p)
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			double[] darts = new double[n];
			int sum = 0;
//			(-200 ≤ x, y ≤ 200)
			int x = 0;
			int y = 0;
			
			//x^2 + y^2 = r^2
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				x  = Integer.parseInt(st.nextToken());
				y  = Integer.parseInt(st.nextToken());
				darts[i] = Math.sqrt(x*x + y*y);
			}
			int[] circle = {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 10; j++) {
					if(darts[i] > circle[j]) {
						continue;
					}else {
						sum += 10 - j;
						break;
					}
				}
			}
			
			System.out.printf("#%d %d", (T+1), sum);
		}

	}

}
