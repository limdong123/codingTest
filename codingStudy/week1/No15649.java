package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15649 {
	
	static int n,m;
	static boolean visit[];
	static int arr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];	//탐색과정에서 값을 담을 int 배열 arr
		visit = new boolean[n];// 유망한 노드인지 검사하기 위해 boolean배열 
		
		dfs(0);

	}
	
	public static void dfs(int depth) {
		//재귀 깊이가 m과 같아지면 탐색과정에서 담았던 배열을 출력
		if(depth == m) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < n; i++) {
			//만약 해당 노드가 방문하지않았다면 false라면?
			if(!visit[i]) {
				visit[i] = true;	//방문상태로 변경 
				arr[depth] = i+1;	//해당 깊이를 index로 하여i+1값 저장
				dfs(depth + 1);		//다음 자식 노드 방문을 위해 depth 1 증
				visit[i] = false;	//자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경 
			}
		}
	}

}
