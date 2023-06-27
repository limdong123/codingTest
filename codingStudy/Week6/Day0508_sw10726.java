package Week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0508_sw10726 {

	public static void main(String[] args) throws IOException {
		// 10726. 이진수 표현
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			String m_bin = Integer.toBinaryString(m);
			String result = "ON";
			if(n > m_bin.length()) {
				result = "OFF";
			}else {
				for(int i = m_bin.length() -n; i < m_bin.length(); i++) {
					
					if(m_bin.charAt(i) == '1') {
						continue;
					}else {
						result = "OFF";
						break;
					}
				}
			}
			
			
			System.out.printf("#%d %s\n", (T+1), result);
			
		}

	}

}
