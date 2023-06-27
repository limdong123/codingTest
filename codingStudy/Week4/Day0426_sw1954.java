package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1954 {

	public static void main(String[] args) throws IOException {
		// 1954. 달팽이 숫자 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int[] dx = {1, 0, -1, 0};
			int[] dy = {0, 1, 0, -1};
			int d = 0;
			int x = 0, y = 0;
			int[][] map = new int [n][n];
			
			for(int i = 0; i < n*n; i++) {
				map[y][x] = i+1;
				x += dx[d];
				y += dy[d];
				
				if( x >= n || x < 0 || y >= n || y < 0 || map[y][x] != 0) {
					x -= dx[d];
					y -= dy[d];
					
					d = (d+1)%4;
					
					x += dx[d];
					y += dy[d];
				}
			}
			
			System.out.println("#" + (T+1));
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.printf("%d ", map[i][j]);
				}
				System.out.println();
			}
			
		}
		

	}

}
