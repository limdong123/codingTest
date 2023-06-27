package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0501_sw15758 {

	public static void main(String[] args) throws IOException {
		// 15758. 무한 문자열
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
//			두 개의 문자열 S와 T가 주어질 때, f(S)=f(T)인지의 여부를 구하
			
			String a = st.nextToken();
			String b = st.nextToken();
			String result = "yes";
			
			//ababab abab -> yes
			//hello hello -> yes
			//aba bab -> no
			
			int len_a = a.length();
			int len_b = b.length();
			
			int len_ab = len_a * len_b;
			
			
			String aaa = "";
			String bbb = "";
			
			for(int i = 0; i < len_b; i++) {
				aaa += a;
			}
			for(int i = 0; i < len_a; i++) {
				bbb += b;
			}
			
			char[] ap_a = aaa.toCharArray();
			char[] ap_b = bbb.toCharArray();
			
			for(int i = 0; i < len_ab; i++) {
				if(ap_a[i] != ap_b[i]) {
					result = "no";
					break;
				}
			}
			
			
			System.out.printf("#%d %s\n", (T+1), result);
			
		}

	}

}
