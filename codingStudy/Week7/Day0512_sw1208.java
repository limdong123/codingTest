package Week7;

import java.util.Arrays;
import java.util.Scanner;

public class Day0512_sw1208 {

	public static void main(String[] args) {
		// 1208. [S/W 문제해결 기본] 1일차 - Flatten
		
		 Scanner sc = new Scanner(System.in);
	        int T = 10; // 테스트 케이스 개수
	        int N;

	        for (int t = 1; t <= T; t++) {
	            N = sc.nextInt(); // dump
	            int[] boxes = new int[100];
	            for (int i = 0; i < 100; i++) {
	                boxes[i] = sc.nextInt();
	            }
	            
	            Arrays.sort(boxes);
	            
	            for(int i = 0; i < N; i++) {
	            	boxes[0]++;
	            	boxes[99]--;
	            	Arrays.sort(boxes);
	            			
	            }
	           
	            System.out.println("#" + t + " " + (boxes[99] - boxes[0]));
	        }
	    }
}
