package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0401_11655 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String result = "";
		
		
		for(int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);
			int b = input.charAt(i);
			
			if(b >= 97 && b <= 122) { //소문자 
				b = b + 13;
				if(b > 122) {
					b = b - 26;
				}
			}else if(b >= 65 && b <= 90) { //대문자 
				b = b+13;
				if(b > 90) {
					b = b - 26;
				}
			}else if(b >= 48 && b <= 57) { //숫자 
				b = b;
			}else if(b == 32) { // space 
				b = b;
			}
			
			char c = (char)b;
			result = result + c;
		}
		
		System.out.println(result);
		
	}

}
