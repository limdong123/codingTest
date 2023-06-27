package codingStudy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class No18310 {

	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
//		int home[] = new int [n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		int maxLength = 0;
		for(int i = 0; i<n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
//			if(home[i] > maxLength) {
//				maxLength = home[i];
//			}
		}
		
		//각각 home[i] i마다 home[] 안에 숫자와 비교해 거리릴 구한다.
		//그 값들을 전부 더하고 max값과 비교한다.
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int center = 0;
		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(home[i] == home[j]) {
//					sum += 0;
//				} else {
//					//양수 음수
//					if(home[i] > home[j]) {
//						sum += home[i] - home[j];
//					}else {
//						sum += home[j] - home[i];
//					}
//				}
//			}
//			if(min > sum) {
//				min = sum;
//				center = home[i];
//			}
//		}
		
		Collections.sort(arr);
		
		System.out.println(arr.get((n-1)/2));		
	}

}
