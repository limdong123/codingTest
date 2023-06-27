package Week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0508_sw10505 {

	public static void main(String[] args) throws IOException {
		// 10505. 소득 불균형
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
//			당신은, n명의 사람의 소득이 주어졌을 때 이 중 평균 이하의 소득을 가진 사람들의 수를 출력해야 한다.
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] man = new int[n];
			int sum = 0;
			double avg = 0.0; 
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				man[i] = Integer.parseInt(st.nextToken());
				sum += man[i];
			}
			
			avg = sum / n;
			
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				if(man[i] <= avg) {
					cnt++;
				}
			}
			
			System.out.printf("#%d %d\n", (T+1), cnt);
			
		}
		br.close();
	}

}
