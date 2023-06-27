package Week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day0508_sw10912 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		for(int T = 0; T < test_case; T++) {
			
			int[] ap_cnt = new int['z'+ 1];
			
			String input = sc.next();
			String result = "";
			
			for(int i = 0; i < input.length(); i++) {
				for(int j = 'a'; j < 'z' + 1; j++) {
					if((int)input.charAt(i) == j) {
						ap_cnt[j]++;
					}
				}
			}
			
			for(int i = 'a'; i < 'z'+1; i++) {
				if(ap_cnt[i]%2 == 1) {
					result += (char)i;
				}
			}
			if(result == "") {
				System.out.printf("#%d Good\n", (T+1));
			}else {
				System.out.printf("#%d %s\n", (T+1), result);
			}
			
		}
		

	}

}
