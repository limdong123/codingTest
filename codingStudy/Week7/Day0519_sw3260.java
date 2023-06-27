package Week7;

import java.math.BigInteger;
import java.util.Scanner;

public class Day0519_sw3260 {

	public static void main(String[] args) {
		// 3260. 두 수의 덧셈
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		for(int T = 1; T <= test_case; T++) {
			
			String a = sc.next();
			String b = sc.next();
			
			BigInteger num1 = new BigInteger(a);
			BigInteger num2 = new BigInteger(b);
			
			BigInteger result = BigInteger.ZERO;
			
			result = result.add(num1);
			result = result.add(num2);
			
			
			System.out.printf("#%d %s\n", T, result.toString());
			
		}

	}

}
