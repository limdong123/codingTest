package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15652 {
	
	static int n,m;
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		//같은 수를 여러번 골라도 가능, 고른 수열은 비내림차순)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		dfs(1, 0);
		System.out.println(sb);

	}
	
	public static void dfs(int at, int depth) {
		if(depth == m) {
			for(int i = 0; i<m; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i = at; i <= n; i++) {
			arr[depth] = i;
			dfs(i, depth+1);
		}
	}

}
