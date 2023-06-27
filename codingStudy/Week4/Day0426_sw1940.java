package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1940 {

	public static void main(String[] args) throws IOException {
		// 1940. 가랏! RC카!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int result = 0;
			int now_speed = 0;
			
			while(n != 0) {
				st = new StringTokenizer(br.readLine());
				
				int command = Integer.parseInt(st.nextToken());

				
				// 0 = 유지, 1 증속 , 2  감속 
				if(command == 0) {
					result += now_speed;
				}else if(command == 1) {
					int speed = Integer.parseInt(st.nextToken());
					now_speed += speed;
					result += now_speed;
				}else if(command == 2){
					int speed = Integer.parseInt(st.nextToken());
					now_speed -= speed;
					if(now_speed < 0) {
						now_speed = 0;
					}
					result += now_speed;
				}
				n--;
			}
			
			System.out.printf("#%d %d\n", (T+1), result);
		}
		
	}

}
