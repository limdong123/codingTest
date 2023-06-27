package codingStudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No2178_2 {
	
	static int n;
	static int m;
	static int map[][];
	static boolean visite[][];
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0,0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt( st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		for(int i = 0; i< n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		visite = new boolean[n][m];
		visite[0][0] = true;
		bfs(0,0);
		System.out.println(map[n-1][m-1]);
	}
	
	public static void bfs(int x, int y) {
		//queue 선언, int[]형태
		Queue<int[]> q = new LinkedList<>();
		//q.add 값추가,x,y 값을 추가해
		q.add(new int[] {x,y});
		
		
		//!q.isEmpty() 비있지 않다면 반복  
		while(!q.isEmpty()) {
			//q.poll()큐가 첫번째 값을 반환하고 제거 큐가 비어있으면 null반환,
			int now[] = q.poll();
			//반환받은 nowX, nowY x,y값 넣어주기  
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i = 0; i<4; i++) {
				int nx = nowX + dx[i];
				int ny = nowY + dy[i];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= m)continue;
				//visite[nx][ny] || map[nx][ny] == 0  false || map 0
				if(visite[nx][ny] || map[nx][ny] == 0)continue;
				
				q.add(new int[] {nx, ny});
				map[nx][ny] = map[nowX][nowY] + 1;
				
				visite[nx][ny] = true;
			}
		}
	}
}
