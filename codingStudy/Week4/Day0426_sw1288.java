package Week4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0426_sw1288 {

    public static void main(String[] args) throws IOException {
        // 1288. 새로운 불면증 치료법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int test_case = Integer.parseInt(st.nextToken());
        for(int T = 0; T < test_case; T++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            boolean[] num = new boolean[10];
            int result = 1;
            int cnt = 0;

            // while 반복문에서 n을 쪼개서 그 값을 num에서 false면 true로 바꿔준다
            while(cnt < 10) {
                int nk = n * result;
                while(nk > 0) {
                    int k = nk % 10;
                    if(!num[k]) {
                        num[k] = true;
                        cnt++;
                    }
                    nk /= 10;
                }
                result++;
            }
            System.out.printf("#%d %d\n", (T+1), n*(result-1));
        }
    }
}
