package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0501_sw14413 {
	static int n,m;
	static char[][] map;
	
	public static void main(String[] args) throws IOException {
		// 14413. 격자판 칠하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			//# = black, . = white, ? = black or white 
			map = new char[n][m];
			String result = "possible";

			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String c = st.nextToken();
				for(int j = 0; j < m; j++) {
					map[i][j] = c.charAt(j);
				}
			}
			
			if(WB() || BW()) {
				System.out.printf("#%d possible\n", (T+1));
			}else {
				System.out.printf("#%d impossible\n", (T+1));
			}
			
		}

	}

	private static boolean BW() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if((i+j)%2 == 0 && map[i][j] == '#') {
					return false;
				}else if((i+j)%2 == 1 && map[i][j] == '.') {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean WB() {
		// TODO Auto-generated method stub
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if((i+j)%2 == 0 && map[i][j] == '.') {
					return false;
				}else if((i+j)%2 == 1 && map[i][j] == '#') {
					return false;
				}
			}
		}
		return true;
	}

}
