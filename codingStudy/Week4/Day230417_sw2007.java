package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day230417_sw2007 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 1; T < test_case+1; T++) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			
			int result = 0;
			for(int i = 1; i < input.length(); i++){
				
				String a = input.substring(0,i);
				String b = input.substring(i, 2*i);
				
				if(a.equals(b)) {
					result = a.length();
					System.out.printf("#%d %d\n", T, result);
					break;
				}
				
			}
			
		}	
	}
}
