package Week8;

import java.util.Arrays;
import java.util.Scanner;

public class Day0525_BJ1159 {

	public static void main(String[] args) {
		// 농구 경기 b2
		//PREDAJA or 앞2글자 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char[] input = new char[n];
		String result = "";
		
		for(int i = 0; i < n; i++) {
			String st = sc.next();
			char sub_st = st.charAt(0);
			input[i] = sub_st;
		}
		
		Arrays.sort(input);
		int[] ap = new int[26];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 26; j++) {
				if(j == input[i] - 'a') {
					ap[j]++;
				}
			}
		}
		
		for(int i = 0; i < 26; i++) {
			if(ap[i]>= 5) {
				result += (char)(i + 'a');
			}
		}
		
		if(result.equals("")) {
			System.out.printf("PREDAJA");
		}else {
			System.out.printf("%s", result);
		}

	}

}
