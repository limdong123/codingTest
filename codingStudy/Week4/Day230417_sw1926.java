package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day230417_sw1926 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		
		//3,6,9가 있으면 '-'출력 
		
		for(int i = 1; i < num+1; i++) {
			String stringNum = Integer.toString(i);
			
			char[] k = new char[stringNum.length()];
			String re = "";
			int cnt =0;
			for(int j = 0; j < k.length; j++) {
				k[j] = stringNum.charAt(j);
			}
			
			for(int j = 0; j < k.length; j++) {
				if(k[j] != '0' && (int)k[j]%3 == 0) {
					re += "-";
					cnt++;
				} 
				
			}
			if(cnt == 0) {
				System.out.printf("%s", stringNum);
			}
			else {
				System.out.printf("%s", re);
			}
			

		
			System.out.print(" ");
			
			
		}
		
	}

}
