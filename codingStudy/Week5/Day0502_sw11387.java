package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0502_sw11387 {

	public static void main(String[] args) throws IOException {
		// 11387. 몬스터 사냥

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			
			st = new StringTokenizer(br.readLine());
			//D = 데미지, L = 레벨 추가 데미지, N = 때린 횟수 
			double D = Integer.parseInt(st.nextToken());
			double L = Integer.parseInt(st.nextToken());
			double N = Integer.parseInt(st.nextToken());
//			D(1+nㆍL%)
			//D(1 + n * L%)
			long result = 0;
			for(double i = 0; i < N; i++) {
				result += D * (1 + (i * L * 0.01));
			}
			System.out.printf("#%d %1d\n", (T+1), result);
		}
		
	}

}
