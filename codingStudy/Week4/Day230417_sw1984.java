package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day230417_sw1984 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 1; T < test_case+1; T++) {
			st = new StringTokenizer(br.readLine());
			//최대, 최소 제외한 나머지 평균값 출력, 소수점 첫째 자리 반올림 
			
			int[] nums = new int[10];
			double result = 0.0;
			int sum = 0;
			int maxNum = 0;
			int minNum = 10001;
			
			for(int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] > maxNum) {
					maxNum = nums[i];
				}
				if(nums[i] < minNum) {
					minNum = nums[i];
				}
				sum += nums[i];
			}
			
			sum -= minNum + maxNum;
			result = sum/8.0;
			result = Math.round(result*10)/10;
			System.out.printf("#%d %.0f\n", T, result);
			
		}	
	}
}
