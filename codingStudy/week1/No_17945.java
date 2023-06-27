package codingStudy.week1;

import java.util.Scanner;

public class No_17945 {

	public static void main(String[] args) {
		// x^2 + 2Ax + B
				// A = 2, B =3
				// (x+3)(x+1)
				// 2A = B1 + B2
				// B = B1 * B2
				int result_b1 = 0;
				int result_b2 = 0;
				
				Scanner sc = new Scanner(System.in);
				int A = sc.nextInt();
				int B = sc.nextInt();
				
				if(B > 0) {
					for(int i = 1; i <= B; i++) {
						if(B % i == 0) {
							if(2*A == (i + (B/i))) {
								result_b1 = i;
								result_b2 = B/i;
								break;
							}
						}
					}
				}else if(B < 0){
					for(int i = 1; i <= (-1)*B; i++) {
						if((-1)*B % i == 0) {
							if(2*A == (i + (B/i))) {
								result_b1 = i;
								result_b2 = B/i;
								break;
							}
						}
					}
				} else {
					result_b2 = 2*A;
					result_b1 = 0;
				}
				

				
				if(result_b1 > result_b2) {
					System.out.printf("%d %d\n", (-1)*result_b1, (-1)*result_b2);
				}else if(result_b1 < result_b2) {
					System.out.printf("%d %d\n", (-1)*result_b2, (-1)*result_b1);
				}else {
					System.out.printf("%d \n", (-1)*result_b2);
				}	
			}
	}