package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No9663 {
	
	static int n;
	static int map[];
	static int cnt;

	public static void main(String[] args) throws IOException {
		//n 크기 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		map = new int[n];
		cnt = 0;
		
		nQueen(0);
		System.out.println(cnt);
	}

	private static void nQueen(int depth) {
		if(depth == n) {
			cnt++;
			return;
		}
		
		for(int i = 0; i < n; i++) {
			map[depth] = i;
			if(Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
	}

	private static boolean Possibility(int col) {
		for(int i = 0; i< col; i++) {
			if(map[col] == map[i]) {
				return false;
			}
			else if(Math.abs(col -i ) == Math.abs(map[col] - map[i])){
				return false;
			}
		}
		return true;
	}
}
