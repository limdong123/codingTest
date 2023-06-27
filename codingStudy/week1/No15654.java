package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No15654 {
	
	static int n,m;
	static int result_arr[];
	static int n_arr[];
	static boolean visited[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		result_arr = new int[m];
		n_arr = new int [n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<n; i++) {
			n_arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(n_arr);
		
		dfs(0);
		System.out.println(sb);
	}
	
	public static void dfs(int depth) {
		if(depth == m) {
			for(int i = 0; i < m; i++) {
				sb.append(result_arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i<n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				result_arr[depth] = n_arr[i];
				dfs(depth+1);
				visited[i] = false;
			}
		}
	}

}
