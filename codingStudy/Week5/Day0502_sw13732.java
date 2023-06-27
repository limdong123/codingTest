package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw13732 {

	public static void main(String[] args) throws IOException {
		// 13732. 정사각형 판정
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			char[][] map = new char[n][n];
			String result = "";
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String c = st.nextToken();
				for(int j = 0; j < n; j++) {
					map[i][j] = c.charAt(j);
				}
			}
			
//			정사각형 판정 문제는 x의 최솟값/최댓값, y의 최솟값/최댓값을 찾아 해결할 수 있습니다. 
//			x, y의 최소/최댓값을 찾은 이후에는, 가로/세로 길이가 동일한지 확인하고, 
//			정사각형의 내부가 막혀있는 격자로 채워져있는지 확인하면 됩니다. 
			
			int[] pos = {n+1, n+1, -1, -1}; // x의 최소 좌표, y의 최소 좌표, x의 최대 좌표, y의 최대 좌표
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(map[i][j] == '#') {
						pos[0] = Math.min(pos[0], j);
						pos[1] = Math.min(pos[1], i);
						pos[2] = Math.max(pos[2], j);
						pos[3] = Math.max(pos[3], i);
					}
				}
			}
			
			boolean check = true;
			if(pos[2] - pos[0] != pos[3] - pos[1]) { //가로/세로 길이가 동일한지 확인하고,
				check = false;
			}
//			정사각형의 내부가 막혀있는 격자로 채워져있는지 확인하면 됩니다. 
			for(int i = pos[1]; i <= pos[3]; i++) {
				for(int j = pos[0]; j <= pos[2]; j++) {
					if(map[i][j] == '.') {
						check = false;
					}
				}
			}
			
			if(check == true) {
				result = "yes";
			}else {
				result = "no";
			}
			
			System.out.printf("#%d %s\n", (T+1), result);
			
		}

	}

}
