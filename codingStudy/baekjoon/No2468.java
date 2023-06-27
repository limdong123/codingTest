package codingStudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2468 {
	static int n;
	static int map[][];
	static boolean visited[][];
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		visited = new boolean[n][n];
		int maxCnt = 0;
		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] > maxCnt) {
					maxCnt = map[i][j];
				}
			}
		}
		int max = 0;
		for(int height = 0; height < maxCnt+1; height++) {
			visited = new boolean[n][n];
			cnt = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <n; j++) {
					if(visited[i][j] || map[i][j] < height)continue;
					cnt += dfs(i,j,height);
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);	
	}
	
	public static int dfs(int x, int y, int height) {
		visited[x][y] = true;
		
		for(int i =0; i<4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if(nx<0 || nx>= n || ny < 0 || ny >= n)continue;
			if(visited[nx][ny] || map[nx][ny] < height)continue;
			
			dfs(nx, ny, height);
		}
		return 1;
	}
}
