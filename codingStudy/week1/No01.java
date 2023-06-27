package codingStudy.week1;
import java.util.Scanner;
import java.io.FileInputStream;

public class No01 {
// 1959. 두개의 숫자열
//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PpoFaAS4DFAUq&categoryId=AV5PpoFaAS4DFAUq&categoryType=CODE&problemTitle=1959&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
		int sum = 0;
			int sumMax = 0;
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int arr_n[] = new int[n];
			int arr_m[] = new int[m];
			
			for(int i = 0; i < n; i++) {
				arr_n[i] = sc.nextInt();
			}
			for(int i = 0; i < m; i++) {
				arr_m[i] = sc.nextInt();
			}
			// 0 1 2
			// 0 1 2 3 4
			// 1 -> 0 1 2 * 0 1 2
			// 2 -> 0 1 2 * 1 2 3
			// 3 -> 0 1 2 * 2 3 4
			if(n < m) {
				for(int i = 0; i < m-n+1; i++) {
					sum = 0;
					for(int j = i; j < n+i; j++) {
						sum += arr_n[j-i] * arr_m[j];
					}
					if(sum > sumMax) {
						sumMax = sum;
					}
				}
			}
			else {
				for(int i = 0; i < n-m+1; i++) {
					sum=0;
					for(int j = i; j <m+i; j++) {
						sum += arr_n[j] * arr_m[j-i];
					}
					if(sum > sumMax) {
						sumMax = sum;
					}
				}
			}
			
			System.out.printf("#%d %d\n", test_case, sumMax);
		}
	}
}