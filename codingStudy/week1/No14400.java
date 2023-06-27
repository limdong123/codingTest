package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class No14400 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// x값중 중간값, y값중 중간값 - 각점들간의 거리 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		
//		int guest[][] = new int[n][2];
		ArrayList<Integer> arrX = new ArrayList<>();
		ArrayList<Integer> arrY = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arrX.add(Integer.parseInt(st.nextToken()));
			arrY.add(Integer.parseInt(st.nextToken()));
		}
	
		//중간값 구하기 평균x
		//정렬하기 
		Collections.sort(arrX);
		Collections.sort(arrY);

		int centerX = arrX.get((n-1)/2);
		int centerY = arrY.get((n-1)/2);
		
		int sum = 0;
		//각각의 거리 더하기 |x1-x2| + |y1-y2|
		for(int i = 0; i<n; i++) {
			sum += Math.abs(centerX-arrX.get(i)) + Math.abs(centerY-arrY.get(i));
		}
		
		System.out.println(sum);
		
	}

}
