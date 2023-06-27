package codingStudy.baekjoon;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No2178_3 {
	static int n;
	static int m;
	static int map[][];
	static boolean vistied[][];
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt( st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		for(int i = 0; i<n; i++) {
			String s = br.readLine();
			for(int j = 0; j<m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		vistied = new boolean[n][m];
		vistied[0][0] = true;
		bfs(0,0);
		System.out.println(map[n-1][m-1]);
	}
	public static void bfs(int x, int y) {
		Queue<int []> q = new LinkedList<>();
		q.add(new int[] {x,y});
		
		while(!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i =0; i< 4; i++) {
				int nx = dx[i] + nowX;
				int ny = dy[i] + nowY;
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m)continue;
				if(vistied[nx][ny] || map[nx][ny] == 0)continue;
				
				//visried[nx][ny]
				q.add(new int[] {nx,ny});
				map[nx][ny] = map[nowX][nowY] + 1;
				
				vistied[nx][ny] = true;
				
			}
		}
		
		
		
	}

}
