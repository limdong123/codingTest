package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_14568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//남는 사탕 x
		// a >= b+2
		// a, b, c 0개면 안됨
		// c%2 == 0
		
		int cnt = 0;
		
		//경우의 수 6 5 4
		for(int i = 1; i <= n; i++) {
			for(int j =1; j<= n-i; j++) {
				for(int k =1; k <= n-i-j; k++) {
					if(i + j + k == n) {
						if(i >= j+2) {
							if(k%2 == 0) {
								cnt++;
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
