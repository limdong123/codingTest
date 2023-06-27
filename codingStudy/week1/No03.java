package codingStudy.week1;
import java.util.Scanner;


public class No03 {
	
	public static int[][] Rotation(int[][] arr){
		int[][] result = new int[arr.length][arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				result[i][j] = arr[arr.length - j -1][i];
			}
		}
		return result;
	}
	
//1961. 숫자 배열 회전
//https://swexpertacademy.com/main/solvingProblem/solvingProblem.do
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			//입력 받
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			//90도 회전
			//180도 회전
			//270도 회전 
			int[][] result_90 = Rotation(arr);
			int[][] result_180 = Rotation(result_90);
			int[][] result_270 = Rotation(result_180);
			
			System.out.printf("#%d\n", test_case);
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<n; j++) {
					System.out.print(result_90[i][j]);
				}
				System.out.print(" ");
				
				for(int j = 0; j<n; j++) {
					System.out.print(result_180[i][j]);
				}
				System.out.print(" ");
				
				for(int j = 0; j<n; j++) {
					System.out.print(result_270[i][j]);
				}
				System.out.println();
			}
			
			
		}
	}

}
