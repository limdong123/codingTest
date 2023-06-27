package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0401_2979 {

	public static void main(String[] args) throws IOException {
		//5 3 1(1대,2대,3대 주차 가격)
		//1 6 (도착시간, 나간 시간)
		//3 5
		//2 8
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] data = new int [100];
		int result = 0;
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			for(int j = start; j < end; j++) {
				data[j]++;
			}
		}
		
		for(int i = 0; i < 100; i++) {
			if(data[i] == 1) {
				result += a;
			}
			else if(data[i] == 2) {
				result += b*2;
			}
			else if(data[i] == 3) {
				result += c*3;
			}
		}
		
		System.out.println(result);
		
	}

}
