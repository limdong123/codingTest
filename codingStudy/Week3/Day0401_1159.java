package Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0401_1159 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//선수 숫자 
		int num = Integer.parseInt(br.readLine());
		//선수 이름을 저장할 배열 
		String[] player = new String[num];
		//a-z까지 카운트할 배열 
		int[] firstName = new int[26]; 
		
		String result = "";
				
		//배열에 선수 이름 입력 
		for(int i = 0; i < num; i++) {
			//이름 입력 
			player[i] = br.readLine();
			//첫글자를 숫자로 변경 a = 0, b = 1, ..
			int j = player[i].charAt(0) - 'a';
			firstName[j]++;
		}
		
		for(int i = 0; i < 26; i++) {
			//5명 이상이면 출전 가
			if(firstName[i] >= 5) {
				//숫자를 알파벳으로 변경 
				char ap = (char)(i + 'a');
				result = result + ap;
			}
		}
		//5인 이상 모이지 않았으면 
		if(result == "") {
			result = "PREDAJA";
		}
		System.out.println(result);
	}

}
