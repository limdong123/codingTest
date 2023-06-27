package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15650 {
	
	static int n,m;
	static int arr[];
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visited = new boolean[n];
		
		dfs(1, 0);
	}
	
	public static void dfs(int at,int depth) {
		//출력은 depth(깊이)가 m과 같을때, arr가 다 채워졌을 때
		if(depth == m ) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		//탐색 시작
		for(int i = at; i<= n; i++) {
			arr[depth] = i;
			dfs(i+1, depth + 1);
		}
	}

}
