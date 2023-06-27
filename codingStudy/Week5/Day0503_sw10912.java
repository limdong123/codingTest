package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day0503_sw10912 {

	public static void main(String[] args) throws IOException {
		// 10912. 외로운 문자
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		for(int T = 0; T < test_case; T++) {
			
			String s = br.readLine();
			char[] S = s.toCharArray();
			//정렬 
			
			int[] check = new int['z' + 1];
			String result = "";
			for(int i = 0; i < S.length; i++) {
				check[S[i]]++;
			}
			for(int i = 'a'; i <= 'z'; i++) {
				if(check[i]%2 != 0) {
					result += (char)i;
				}
			}
			
			if(result == "") {
				System.out.printf("#%d Good\n",(T+1));
			}else {
				System.out.printf("#%d %s\n", (T+1), result);
			}
			
			
			
		}
		
	}

}
