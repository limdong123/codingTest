package codingStudy.week1;
//1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
//https://swexpertacademy.com/main/solvingProblem/solvingProblem.do

import java.util.Scanner;

public class No05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int test_case = 0; test_case < T; test_case++) {
			int case_t = sc.nextInt();
			
			int data[] = new int[1000];
			int scoreMax = 0;
			int scoreMaxIdx = 0;
			
			//1000개 입력
			for(int i = 0; i<1000; i++) {
				data[i] = sc.nextInt();
			}
			
			//점수 카운트할 배열
			int score[] = new int[101];
			
			//1000개의 배열을 순회하며 해당 값을score인덱스에 ++
			for(int i = 0; i < 1000; i++) {
				score[data[i]]++;
			}
			
			//score에서 가장 큰값을 가진 값을 scoreMax 그 인덱스 저.
			//0->101진행하므로 score >= scoreMax 
			for(int i = 0; i < 101; i++) {
				if(score[i] >= scoreMax) {
					scoreMax = score[i];
					scoreMaxIdx = i;
				}
			}
			
			System.out.printf("#%d %d\n", case_t, scoreMaxIdx);
		}
	}
}

