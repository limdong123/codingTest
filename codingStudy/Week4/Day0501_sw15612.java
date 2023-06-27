package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0501_sw15612 {

	public static void main(String[] args) throws IOException {
		// 15612. 체스판 위의 룩 배치

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			
			char[][] map = new char[8][8];
			String result = "yes";
			int cnt = 0;
			boolean[] point_x = new boolean[8];
			boolean[] point_y = new boolean[8];
			for(int i = 0; i < 8; i++) {
				st = new StringTokenizer(br.readLine());
				String input = st.nextToken();
				for(int j = 0; j < 8; j++) {
					
					map[i][j] = input.charAt(j);
					if(map[i][j] == 'O') {
						cnt++;
					}
				}
			}
			
			if(cnt != 8) {
				result = "no";
			}else {
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8; j++) {
						if(map[i][j] == 'O') {
							if(point_x[j]) {
								result = "no";
							}else if(point_y[i]) {
								result = "no";
							}else {
								point_x[j] = true;
								point_y[i] = true;
							}
						}
					}
				}
			}
			
			
			System.out.printf("#%d %s\n" , (T+1), result);
			
		}
		
	}

}
