package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1974 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			int[][] map = new int[9][9];
			int result = 1;
			
			for(int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 9; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			boolean[] test = new boolean[10];
			
			//가로 검증 
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					int a = map[i][j];
					if(!test[a]) {
						test[a] = true;
					}else {
						result = 0;
						break;
					}
				}
				test = new boolean[10];
			}
			
			//세로 검증 
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					int a = map[j][i];
					if(!test[a]) {
						test[a] = true;
					}else {
						result = 0;
						break;
					}
				}
				test = new boolean[10];
			}
			//3*3 검증 
			for(int i = 0; i < 9; i=i+3) {
				for(int j = 0; j < 9; j=j+3) {
					for(int k = i; k < i+3; k++) {
						for(int l = j; l < j+3; l++) {
							int a = map[k][l];
							if(!test[a]) {
								test[a] = true;
							}else {
								result = 0;
								break;
							}
						}
					}
					test = new boolean[10];
				}
			}
			
			System.out.printf("#%d %d", (T+1),result);
			
		}
		
	}

}
