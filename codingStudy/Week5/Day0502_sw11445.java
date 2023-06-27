package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw11445 {

	public static void main(String[] args) throws IOException {
		// 11445. 무한 사전
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		for(int T = 0; T < test_case; T++) {
			
			String p = br.readLine();
			String q = br.readLine();
			char[] P = p.toCharArray();
			char[] Q = q.toCharArray();
			
			String p_a = p + "a";
			//중간에 값이 있으려면 
			
			if(!p_a.equals(q)) {
				System.out.printf("#%d Y\n", (T+1));
			}else {
				System.out.printf("#%d N\n", (T+1));
			}
			
			
		}
		
	}

}
