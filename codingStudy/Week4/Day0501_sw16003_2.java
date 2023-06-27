package Week4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0501_sw16003_2 {
    static int MAXN = 10000000;
    static boolean[] isComposite = new boolean[MAXN +1];

    public static void main(String[] args) throws IOException {
        // 16002. 합성수 방정식

        // 에라토스테네스의 체를 이용해 합성수 찾기
        for (int i = 2; i <= MAXN; i++) {
            if (isComposite[i]) continue;
            for (int j = i*2; j <= MAXN; j += i) {
                isComposite[j] = true;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int test_case = Integer.parseInt(st.nextToken());
        for (int T = 0; T < test_case; T++) {
        	
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int x = 0, y = 0;
            
            for(int i = n+1; i < MAXN; i++) {
            	if(isComposite[i] && isComposite[i-n]) {
            		x = i;
            		y = i-n;
            		break;
            	}
            }
            
            

            System.out.printf("#%d %d %d\n", T+1, y, x);
        }
    }
}

