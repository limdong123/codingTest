package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Day0426_sw1966 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int[] num = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i<n; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			
			for(int i = 0; i < n-1; i++) {
				for(int j = i+1; j < n; j++) {
					//i(앞의 숫자)가 더크면 뒤로 이동 
					if(num[i] > num[j]) {
						int a = num[i];
						int b = num[j];
						num[i] = b;
						num[j] = a;
					}
				}
			}
			System.out.printf("#%d ",(T+1));
			for(int i =0; i <n; i++) {
				System.out.printf("%d ", num[i]);
			}
			System.out.println();
			
		}

	}

}
