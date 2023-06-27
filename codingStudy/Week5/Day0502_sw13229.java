package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw13229 {

	public static void main(String[] args) throws IOException {
		// 13229. 일요일
		//요일이 주어지면 다음 일요일까지 며칠남았는지 출력 
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test_case = Integer.parseInt(st.nextToken());
		
		String[] date = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			String input = st.nextToken();
			int result = 0;
			for(int i = 0; i < 7; i++) {
				if(date[i].equals(input)) {
					result = 7 - i;
				}
			}
			System.out.printf("#%d %d\n", (T+1), result);
		}

	}

}
