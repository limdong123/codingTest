package codingStudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1012 {
	static int n; //세로 길이
	static int m; //가로
	static int k;
	static int[][] map;
	static boolean visited[][];
	static int cnt;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<tc; i++) {
			cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			map = new int[m][n];
			visited = new boolean[m][n];
			
			k = Integer.parseInt(st.nextToken());
			for(int j = 0; j<k; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int p1 = Integer.parseInt(st.nextToken());
				int p2 = Integer.parseInt(st.nextToken());
				map[p1][p2] = 1;
			}
			
			for(int x = 0; x< m; x++) {
				for(int y = 0; y < n; y++) {
					if(map[x][y] == 1 && !visited[x][y]) {
						dfs(x,y);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i = 0; i< 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < 0 || nx >= m || ny < 0 || ny >= n)continue;
			if(visited[nx][ny] || map[nx][ny] == 0)continue;
			
			dfs(nx, ny);
		}
	}

}
