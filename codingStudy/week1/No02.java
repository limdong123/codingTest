package codingStudy.week1;
import java.util.Scanner;
import java.io.FileInputStream;

public class No02 {

	public static void main(String[] args) {
// 1974 스도쿠 검증
//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5Psz16AYEDFAUq&categoryId=AV5Psz16AYEDFAUq&categoryType=CODE&problemTitle=%EC%8A%A4%EB%8F%84%EC%BF%A0+%EA%B2%80%EC%A6%9D&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		boolean result = true;
		
		for(int test_case = 0; test_case < T; test_case++) {
			//9*9 데이터 받기
			int map[][] = new int[9][9];
			
			for(int i = 0; i<9; i++) {
				for(int j =0; j<9; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			//행 체크
			for(int i = 0; i<9; i++) {
				// arr 9개 배열을 가지는 arr생성, 초기값 false
				boolean arr[] = new boolean[9];
				for(int j =0; j<9; j++) {
					//map의 값 -1 을 true로 변
					arr[(map[i][j]) -1 ] = true;
				}
				for(int k = 0; k<9; k++) {
					if(arr[k] == false) {
						result = false;
						break;
					}
				}
			}
			
			//열 체크
			for(int i =0; i<9; i++) {
				boolean arr[] = new boolean[9];
				for(int j = 0; j<9; j++) {
					arr[(map[j][i]) -1 ] = true;
					
				}
				for(int k =0; k<9; k++) {
					if(arr[k] == false) {
						result = false;
						break;
					}
				}
			}
			
			//3*3체크
			for(int i = 0; i<9; i+=3) {
				for(int j = 0; j<9; j+=3) {
					boolean arr[] = new boolean[9];
					
					for(int k = i; k<i+3;k++) {
						for(int l = j; l<j+3; l++) {
							arr[(map[k][l]) -1 ] = true;
						}
					}
					for(int a = 0; a<9; a++) {
						if(arr[a] == false) {
							result = false;
							break;
						}
					}
				}
			}
			
			//출력
			if(result == true) {
				System.out.printf("#%d 1\n",test_case+1 );
			}
			else {
				System.out.printf("#%d 0\n", test_case+1);
			}
			
			
			
		}
	}

}
