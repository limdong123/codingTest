package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0404_9996 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		String pattern = br.readLine();
		
		String forent = "";
		String back = "";
	
		for(int i = 0; i < pattern.length(); i++) {
			if(pattern.charAt(i) == '*') {
				forent = pattern.substring(0,i);
				back = pattern.substring(i+1,pattern.length());
			}
		}
		
//		char first = pattern.charAt(0);
//		char end = pattern.charAt(2);
		
		String input = "";
		String[] result = new String[n];
		
		int forent_length = forent.length();
		int back_length = back.length();
		
		for(int i = 0; i < n; i++) {
			input = br.readLine();
			if(input.length() < forent_length + back_length) {
				result[i] = "NE";
				continue;
			}
			
			String input_forent = input.substring(0,forent_length);
			String input_back = input.substring(input.length()-back_length, input.length());
//			if(input_forent == forent 
//					&& input_back == back) {
			if(input_forent.equals(forent) && input_back.equals(back)) {
				result[i] = "DA";
			} else {
				result[i] = "NE";
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
