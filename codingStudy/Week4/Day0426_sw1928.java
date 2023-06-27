package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1928 {

	public static void main(String[] args) throws IOException {
		// 1928. Base64 Decoder
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test_case = Integer.parseInt(st.nextToken());
		for(int T = 0; T < test_case; T++) {
			st = new StringTokenizer(br.readLine());
			
			String input = "";
//			1. 표1을 보고 입력받은 문자들을 각각 대응하는 숫자로 변경한다.
//			2. 각 숫자들을 6자리 이진수로 표현하고, 이 이진수들을 한 줄로 쭉 이어 붙인다.
//			3. 한 줄로 쭉 이어붙인 이진수들을 8자리씩 끊어서 십진수로 바꾼다.
//			4. 각각의 십진수를 아스키 코드로 변환한다.
			
			input = st.nextToken();
			
			char[] text = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				      'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				      '0','1','2','3','4','5','6','7','8','9','+','/'
				      };
			int l = input.length();
			int[] input_ch1 = new int[l];
			
			for(int i = 0; i < l; i++) {
				for(int j = 0; j < 63; j++) {
					if(input_ch1.equals(text[j])) {
						input_ch1[i] = text[j];
					}
				}
			}
			for(int i=0; i < l; i++) {
				System.out.println(input_ch1[i]);
			}
			
			
		}
		
	}

}
