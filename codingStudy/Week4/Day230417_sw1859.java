package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day230417_sw1859 {

	public static void main(String[] args) throws IOException {
		//1859. 백만장자 프로젝트 D2
//		다음과 같은 조건 하에서 사재기를 하여 최대한의 이득을 얻도록 도와주자.
//
//	    1. 원재는 연속된 N일 동안의 물건의 매매가를 예측하여 알고 있다.
//	    2. 당국의 감시망에 걸리지 않기 위해 하루에 최대 1만큼 구입할 수 있다.
//	    3. 판매는 얼마든지 할 수 있다.
//
//	예를 들어 3일 동안의 매매가가 1, 2, 3 이라면 처음 두 날에 원료를 구매하여 마지막 날에 팔면 3의 이익을 얻을 수 있다.
		
		int T = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		T = Integer.parseInt(st.nextToken());
		
		for(int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int day = Integer.parseInt(st.nextToken());
			int[] price = new int[day];
			long result = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < day; i++) {
				price[i] = Integer.parseInt(st.nextToken());
			}
			
			int max_value = price[day-1]; //마지막 숫자를 max_value로 초기화 
			
			for(int i = day-2; i > -1; i--) {//거꾸로 진행 
				if(max_value <= price[i]) { // 현재 위치가 max_value보다 크면 바꾸기 
					max_value = price[i];
				} else if(max_value > price[i]) {
					result += max_value - price[i]; //작으면 계산 
				}
			}
			
			System.out.println("#" + (test_case+1) + " " + result);
		}
		

	}

}
