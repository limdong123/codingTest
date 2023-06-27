package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Day230417_sw1983 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 1; T < test_case+1; T++) {
			st = new StringTokenizer(br.readLine());
			//A+, A0, A-, B+, B0, B-, C+, C0, C-, D0
			//총점 = 중간(35) + 기말(45) + 과제(20)
//			학점을 알고싶은 K 번째 학생의 번호가 주어졌을 때,
//
//			K 번째 학생의 학점을 출력하는 프로그램을 작성하라.
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			double[][] map = new double[n][2];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int a,b,c;
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				c = Integer.parseInt(st.nextToken());
				Double sum = 0.0;
				sum += a*0.35 + b*0.45 + c*0.20;
				map[i][0] = sum;
				map[i][1] = (i+1);
			}
			
			Arrays.sort(map, Comparator.comparingDouble(o -> o[0]));
	
			String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
			int mapLength = map.length;
			int gradeCnt = mapLength/10;
			String result = "";
			
			for(int i = 0; i < mapLength; i++) {
//				System.out.printf("%f %f\n",map[i][0], map[i][1]);
				if(map[i][1] == k) {
					result = grade[9 - (i/gradeCnt)];
				}
			}
			System.out.printf("#%d %s\n",T, result );
		}	
	}
}
