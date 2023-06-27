package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw11315 {
	
	static int[] dy = {0, 1, 1, 1};
	static int[] dx = {1, 0, 1, -1};


	public static void main(String[] args) throws IOException {
		// 11315. 오목 판정
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			char[][] map = new char[n][n];
			
			boolean flag = false;
			int cnt = 0;
	
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				for(int j = 0; j < n; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(map[i][j] == 'o') {
						for(int k = 0; k < 4; k++) {
							flag = check(map, j, i, k);
							if(flag) {
								cnt++;
							}
						}
					}
				}
			}
			String result = cnt>0?"YES" : "NO";
			System.out.printf("#%d %s\n", (T+1), result);
		}
	}


	public static boolean check(char[][] map, int x, int y, int k) {
		for(int i = 0; i < 4; i++) {
			y += dy[k];
			x += dx[k];
			
			if(y < 0 || y >= map.length || x < 0 || x >= map.length || map[y][x] != 'o') {
				return false;
			}
		}
		
		return true;
	}

}
