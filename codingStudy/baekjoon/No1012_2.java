package codingStudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1012_2 {
	static int n,m,k;
	static int map[][];
	static boolean vistied[][];
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for(int T = 0; T < tc; T++) {
			cnt = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			map = new int[m][n];
			vistied = new boolean[m][n];
			
			k = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i<k; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int p1 = Integer.parseInt(st.nextToken());
				int p2 = Integer.parseInt(st.nextToken());
				map[p1][p2] = 1;
			}
			
			for(int x = 0; x<m; x++) {
				for(int y = 0; y< n; y++) {
					if(map[x][y] == 0 || vistied[x][y] )continue;
					dfs(x,y);
					cnt++;
				}
			}
			System.out.println(cnt);

		}

	}
	public static void dfs(int x, int y) {
		vistied[x][y] = true;
		
		for(int i =0; i<4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if(nx < 0 || nx >= m || ny < 0 || ny >= n)continue;
			if(vistied[nx][ny] || map[nx][ny] == 0)continue;
			dfs(nx,ny);
		}
	}

}
