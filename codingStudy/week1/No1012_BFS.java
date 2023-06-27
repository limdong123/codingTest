package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No1012_BFS {
	
	static int m,n,k;
	static int map[][];
	static boolean visited[][];
	//					좌 우  상 하    
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static int cnt;
	

	public static void main(String[] args) throws IOException {
		//입력 테스트 케이스 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		//테스트 게이스 반복
		for(int tc = 0; tc < T; tc++ ) {
			//가로 m, 세로 n 배추 심어져있는 위치 개수 K 
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			map = new int[n][m];	
			visited = new boolean[n][m];
			cnt = 0;	//cnt 초기
			
			//map에 당근 넣어주
			for(int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				//map[y축][x축] = 1
				map[y][x] = 1;
			}
			
			//배추가 있는 좌표를 찾고 사방탐색하기 dfs호출 한번에 cnt +1
			for(int y = 0; y < n; y++) {
				for(int x = 0; x < m; x++) {
					if(map[y][x] == 1 && visited[y][x] == false) {
						bfs(y,x);
						cnt = cnt+1;
					}
				}
			}
			System.out.println(cnt);
		}
	}


	private static void bfs(int y, int x) {
		//queue 선언, int[]
		Queue<int[]> queue = new LinkedList<>();
		
		//queue값 추가 y,x  -> {y, x ..}
		queue.add(new int[] {y,x});
		
		// 들어온 좌표 vistide true로 변경
		visited[y][x] = true;
		
		while(!queue.isEmpty()) {
			//queue의 값들을 poll로 전
			int[] poll = queue.poll();
			//받은 좌표(x,y)로 사방탐색 ㄱㄱ
			for(int i = 0; i<4; i++) {
				int nx = poll[1] + dx[i];
				int ny = poll[0] + dy[i];
				
				//범위 확인 
				if(nx < 0 || nx >= m || ny < 0 || ny >= n)continue;
				//사방에 0 || true면 볼필요X 바꾸기 map[n][m]
				if(visited[ny][nx] == true || map[ny][nx] != 1)continue;
				//map[ny][nx]가 1이고 visited가 false경우
				//queue에 다음 좌표를 넣으므로 for문 탈출이후 while문에서 다시 걸림 
				queue.add(new int[] {ny, nx});
				visited[ny][nx] = true;
			}
		}
			
	}
}
