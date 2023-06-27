package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No1012_BFS_2 {
	
	static int m,n,k;
	static int map[][];
	static boolean visited[][];
	static int cnt;
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//테스트케이스 입력 받기 
		int T = Integer.parseInt(st.nextToken());
		//테스트케이스 들어가기
		for(int tc = 0; tc < T; tc++) {
			//m가로 ,n세로 ,k개수 입력
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			//map, visited 선언, cnt 초기화  
			map = new int[n][m];
			visited = new boolean[n][m];
			cnt = 0;
			
			//배추 심어진 개수만큼 map의 값을 1로 만들기
			for(int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[y][x] = 1;
			}
			//map에서 배추를 찾고 방문했는지 확인후 BFS + cnt++
			for(int y = 0; y < n; y++) {
				for(int x = 0; x < m; x++) {
					if(map[y][x] == 1 && visited[y][x] == false) {
						bfs(y,x);
						cnt = cnt + 1;
					}
				}
			}
			//cnt 출력 
			System.out.println(cnt);
		}
		
		
	}


	private static void bfs(int y, int x) {
		//queue를 선언하기
		Queue<int[]> q = new LinkedList<>();
		//queue add로 y,x값 넣기
		q.add(new int[] {y,x});
		
		visited[y][x] = true;
		//while반복문을 돌면서 탐
		while(!q.isEmpty()) {
			int nowXY[] = q.poll();
			int nowX = nowXY[1];
			int nowY = nowXY[0];
			
			for(int i = 0; i < 4; i++) {
				int nx = nowX + dx[i];
				int ny = nowY + dy[i];
				
				if(nx < 0 || nx >= m || ny < 0 || ny >= n )continue;
				if(map[ny][nx] != 1 || visited[ny][nx] == true)continue;
				q.add(new int[] {ny, nx});
				visited[ny][nx] = true;
			}
		}
		
	}

}
