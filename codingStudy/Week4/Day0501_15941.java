package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0501_15941 {

	public static void main(String[] args) throws IOException {
		// 15941. 평행사변형
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			System.out.printf("#%d %d\n", (T+1), n*n);			
		}

	}

}
