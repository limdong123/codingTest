package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day230417_sw2005 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 1; T < test_case+1; T++) {
			st = new StringTokenizer(br.readLine());
			int input = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[input][input];
			
			for(int i = 0; i < input; i++) {
				for(int j = 0; j <= i; j++) {
					if(j == 0 || j == i || i == 0) {
						map[i][j] = 1;
					} else if(j < i){
						map[i][j] = map[i-1][j-1] + map[i-1][j];
					}
				}
			}
			System.out.printf("#%d\n", T);
			for(int i = 0; i < input; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.printf("%d ", map[i][j]);
				}
				System.out.println();
			}
				
			}
			
		}	
	}

