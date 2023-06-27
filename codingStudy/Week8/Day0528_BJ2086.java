package Week8;

import java.io.*;
import java.util.HashMap;

public class Day0528_BJ2086 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	long a,b;
	String[] strs;
	HashMap<Long, Long> hm;
	
	static long MOD = 1000000000;
	
	public void solve() throws IOException{
		strs = br.readLine().split(" ");
		a = Long.parseLong(strs[0]);
		b = Long.parseLong(strs[1]);
		hm = new HashMap<>();
		
		hm.put((long) 1, (long)1);
		hm.put((long) 2, (long)1);
		hm.put((long) 3, (long)2);
		
		long f1 = fibo(a+1);
		long f2 = fibo(b+2);
		long r = (f2 - f1 + MOD)%MOD;
		
		bw.write(String.valueOf(r));
		bw.newLine();
		bw.close();
	}
	
	public long fibo(long idx) {
		if(hm.containsKey(idx)) {
			return hm.get(idx);
		}
        else if ((idx & 1) == 0) {
            long nIdx = idx / 2;
            long f1 = fibo(nIdx - 1);
            long f2 = fibo(nIdx);
            long tf = ((2 * f1) + f2) * f2;

            tf = tf % MOD;
            hm.put(idx, tf);

            return tf;
        }
        // idx가 odd 홀 수
        else {
            long nIdx = (idx + 1) / 2;
            long f1 = fibo(nIdx);
            long f2 = fibo(nIdx - 1);
            long tf = (f1 * f1) + (f2 * f2);
            tf = tf % MOD;

            tf = tf % MOD;
            hm.put(idx, tf);

            return tf;
        }
	}
	
	public static void main(String[] args) throws IOException {
		// 피보나치 수의 합, 골드1
//		제 1항과 제 2항을 1이라 하고, 제 3항부터는 앞의 두 항의 합을 취하는 수열을 피보나치(fibonacci) 수열이라고 한다. 
//		예를 들어 제 3항은 2이며, 제 4항은 3이다.
//
//		피보나치 수열의 a번째 항부터 b번째 항까지의 합을 구하는 프로그램을 작성하시오. 
//		수가 매우 커질 수 있으므로 마지막 아홉 자리만을 구하도록 한다. 즉 1,000,000,000으로 나눈 나머지를 구하면 된다.
		
		Day0528_BJ2086 main = new Day0528_BJ2086();
        main.solve();
		
	}

}
