package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0401_10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String input = br.readLine();
		int L = input.length();
		int result = 1;    
		
		for(int i = 0; i < L; i++) {

				if(input.charAt(i) != input.charAt(L-i-1)) {
					result = 0;
				}
			
		}
		
		System.out.println(result);
		
	}

}
