package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15649_2 {
	
	static int n,m;
	static int arr[];
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());	
		m = Integer.parseInt(st.nextToken());	 
		//if n = 4, m = 2
		arr = new int[m];	//[0, 0]
		visited = new boolean[n];//[false, false, false, false]
		
		dfs(0);
		
	}
	
	public static void dfs(int depth) {
		if(depth == m) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i<n; i++) {
			if(!visited[i]) {
				visited[i] = true;	//[true, true ,false,false]
				arr[depth] = i+1;	//[1,2]
				dfs(depth + 1);		//[true
				visited[i] = false;
			}
		}
	}

}
