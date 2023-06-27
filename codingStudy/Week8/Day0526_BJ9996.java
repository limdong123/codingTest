package Week8;

import java.util.Scanner;

public class Day0526_BJ9996 {

	public static void main(String[] args) {
		// 한국이 그리울 땐 서버에 접속하지, s3
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String pattern = sc.next();
		
		String[] input = new String[n];
		String[] result = new String[n];
		for(int i = 0; i < n; i++) {
			input[i] = sc.next();
		}
		//asdf*sdafs
		String start = "";
		String end = "";
		for(int i = 0; i < pattern.length(); i++) {
			if(pattern.charAt(i)== '*') {
				start = pattern.substring(0, i);
				end = pattern.substring(i+1, pattern.length());
			}
		}
		
		int start_len = start.length();
		int end_len = end.length();
		
		for(int i = 0; i < n; i++) {
			if(input[i].length() < start_len + end_len) {
				result[i] = "NE";
			}else {
				String a = input[i].substring(0,start_len);
				String b = input[i].substring(input[i].length() - end_len, input[i].length());
				
				if(start.equals(a) && end.equals(b)) {
					result[i] = "DA";
				}else {
					result[i] = "NE";
				}
				
			}
			
			
		}

		for(int i = 0; i < n; i++) {
			System.out.printf("%s\n", result[i]);
		}
		
	}

}
