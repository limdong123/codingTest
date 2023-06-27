package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No15664 {
	
	static int n,m;
	static int n_arr[];
	static int result_arr[];
	static boolean visited[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		n_arr = new int[n];
		result_arr = new int[m];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			n_arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(n_arr);
		
		dfs(0, 0);
		System.out.println(sb);
		
	}

	private static void dfs(int start, int depth) {
		if(depth == m) {
			for(int i = 0; i<m; i++) {
				sb.append(result_arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		int before = 0;
		for(int i = start; i < n; i++) {
			if(!visited[i] && n_arr[i] != before) {
				visited[i] = true;
				result_arr[depth] = n_arr[i];
				before = n_arr[i];
				dfs(i+1, depth+1);
				visited[i] = false;
			}
		}
		
	}

}
