package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1961 {
	
	//90도 회전 함수 
	public static int[][] Turn_90(int[][] map, int n){
		int[][] result = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				//map[i][j] => map[n-j-1][i];
				result[i][j] = map[n - j - 1][i];
			}
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			
			int[][] map = new int [n][n];
			
			int[][] map_90 = new int[n][n];
			int[][] map_180 = new int[n][n];
			int[][] map_270 = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			map_90 = Turn_90(map, n); 
			map_180 = Turn_90(map_90, n); 
			map_270 = Turn_90(map_180, n);
			
			System.out.println("#" + (T+1));
			for(int i = 0; i < n; i++) {
				for(int j = 0; j<n; j++) {
					System.out.print(map_90[i][j]);
				}
				System.out.print(" ");
				
				for(int j = 0; j < n; j++) {
					System.out.print(map_180[i][j]);
				}
				System.out.print(" ");
				
				for(int j = 0; j < n; j++) {
					System.out.print(map_270[i][j]);
				}
				System.out.println();
			}
			
			
		}

	}

}
